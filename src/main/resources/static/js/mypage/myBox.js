const boxContainer = $(".mypage-list-right-list-container");
const boxStandards = [
    "우체국 5호 박스 24개",
    "우체국 5호 박스 60개",
    "우체국 5호 박스 120개",
    "우체국 5호 박스 150개"
];
const createDOM = function (box) {
    let text = `
    <div class="use-box-container">
        <div class="use-box-date-container">
            <span class="use-box-date">${box.storageUseDate}</span>
        </div>
        <div class="use-box-content-container">
            <div class="use-box-content-left-container">
                <img src="https://boxful-b2c-test-bucket.s3.ap-northeast-2.amazonaws.com/products/pickup/pallet/ko/one-pallet.png"
                     class="use-box-content-left-img">
                <div class="use-box-content-left-list-container">
                    <d1 class="left-list-wrapper">
                        <dt class="left-list-text">창고규모</dt>
                        <dd class="left-list-text-content">[ ${box.storageSize} ] [ ${boxStandards[3]} ]</dd>
                    </d1>
                    <d1 class="left-list-wrapper">
                        <dt class="left-list-text">등록기간</dt>
                        <dd class="left-list-text-content">${box.storageUseDate} ~ ${box.storageEndDate}</dd>
                    </d1>
                    <d1 class="left-list-wrapper">
                        <dt class="left-list-text">창고금액</dt>
                        <dd class="left-list-text-content">${box.storagePrice} 원</dd>
                    </d1>
                </div>
            </div>
            <div class="use-box-content-right-container">
                <div class="right-btn-container">
                    <a href="" type="button" class="right-btn">
                        <span class="right-btn-text">상세 페이지${box.storageId}</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
`
    return text;
}

boxes.forEach((box, i) => {
    boxContainer.append(
        createDOM(box)
    );
});