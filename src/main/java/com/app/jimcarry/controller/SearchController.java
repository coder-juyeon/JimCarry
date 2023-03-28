package com.app.jimcarry.controller;

import com.app.jimcarry.domain.dto.PageDTO;
import com.app.jimcarry.domain.dto.ReviewDTO;
import com.app.jimcarry.domain.dto.SearchDTO;
import com.app.jimcarry.domain.dto.StorageDTO;
import com.app.jimcarry.domain.vo.Criteria;
import com.app.jimcarry.service.ReviewService;
import com.app.jimcarry.service.StorageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("storages/search/*")
@RequiredArgsConstructor
@Slf4j
public class SearchController {

    private final ReviewService reviewService;
    private final StorageService storageService;

    /* 헤더의 지역별을 눌렀을 때 지역별 창고 목록 검색 */
    @GetMapping("/")
    public String searchAll(@RequestParam("storageAddress") String storageAddress, Model model, Criteria criteria) {
        /* 한 페이지에 보여줄 게시글 개수 */
        int amount = 3;
        /* 검색된 결과의 총 개수 */
        int total = 0;

        /* 창고 searchDTO에 주소로 검색타입 추가 */
        SearchDTO storageSearchDTO = new SearchDTO().createTypes(new ArrayList<>(Arrays.asList("storageAddress")));
        storageSearchDTO.setStorageAddress(storageAddress);

        //         페이지 번호가 없을 때, 디폴트 1페이지
        if (criteria.getPage() == 0) {
            criteria.create(1, amount);
        } else criteria.create(criteria.getPage(), amount);

        /*토탈은 주소로 찾는게 아닌 음....*/
        total = storageService.getTotalDTOBy(storageSearchDTO);
        PageDTO storagePageDTO = new PageDTO().createPageDTO(criteria, total, storageSearchDTO);


        model.addAttribute("storageAddress", storageAddress);
        model.addAttribute("total", total);
        model.addAttribute("storages", storageService.getStorageDTOBy(storagePageDTO));
        model.addAttribute("pagination", storagePageDTO);

        return "/main/search-page";
    }

    /* 창고 상세페이지 조회*/
    @GetMapping("detail/{storageId}")
    public String searchDetail(@PathVariable("storageId") Long storageId, Model model, Criteria criteria){
        /* 한 페이지에 보여줄 게시글 개수 */
        int amount = 3;
        /* 검색된 결과의 총 개수 */
        int total = 0;

        /* 추후에 setUserId 세션으로 변경 */
        SearchDTO searchDTO = new SearchDTO().createTypes(new ArrayList<>(Arrays.asList("storageId")));
        searchDTO.setStorageId(storageId);

        //         페이지 번호가 없을 때, 디폴트 1페이지
        if (criteria.getPage() == 0) {
            criteria.create(1, amount);
        } else criteria.create(criteria.getPage(), amount);

        total = reviewService.getTotalBy(searchDTO);
        PageDTO pageDTO = new PageDTO().createPageDTO(criteria, total, searchDTO);
        model.addAttribute("total", total);
        model.addAttribute("reviews", reviewService.getListBy(pageDTO));
        model.addAttribute("storages", storageService.getStorageBy(storageId).get(0));
        model.addAttribute("pagination", pageDTO);

        return "/detail-info/detail-info";
    }

    /*창고 예약하기*//*
    @GetMapping("pay/{storageId}")
    public String reserveStorage(@PathVariable String storageId, Model model) {

        model.addAttribute("storageId", storageId);
        return "pay/payment"; // 예약 페이지 이름 반환
    }*/

}
