$('.header-dropbox').mouseover(() => {
    $('.header-dropbox-ul').css('display', 'block');
}).mouseout(() => {
    $('.header-dropbox-ul').css('display', 'none');
});

$(window).scroll(function(){
    var scrollTop = $(window).scrollTop();
    if (scrollTop == 0) {
        $('.menu-fix-change').attr('class', 'menu-fix');
    } else {
        $('.menu-fix').attr('class', 'menu-fix-change');
    }
});

const $localName = $(".header-dropbox-li span").val();

/*function ajax(){

    $.ajax({
        url: "/storages/search/local",
        data: "localName=" + $localName,
        type: "POST",
        success : function(data){
            alert("성공");
        },
        error : function(){
            alert("에러");
        }
    });
}*/

/*지역별 창고 누르면 이동 */
$(function() {
    $('.header-dropbox-ul a').click(function(event) {
        event.preventDefault();

        let param = $(this).attr("href");
        location.href = "/storages/list/" + param;
    });
});

