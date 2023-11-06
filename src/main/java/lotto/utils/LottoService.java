package lotto.utils;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.domain.LottoResult;
import lotto.domain.WinningLotto;

import java.util.List;

import static lotto.global.constant.LottoConstant.*;

public class LottoService {

    public Lotto generateUserLotto(){
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(
                LOTTO_NUMBER_RANGE_START, LOTTO_NUMBER_RANGE_END, LOTTO_NUMBER_COUNT);
        return new Lotto(randomNumbers);
    }

    public WinningLotto generateWinningLotto(){
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(
                LOTTO_NUMBER_RANGE_START, LOTTO_NUMBER_RANGE_END, LOTTO_NUMBER_COUNT);
        int bonusNumber = Randoms.pickNumberInRange(LOTTO_NUMBER_RANGE_START,LOTTO_NUMBER_RANGE_END);
        return new WinningLotto(randomNumbers, bonusNumber);
    }

    public LottoResult purchaseLotto(int lottoPurchasePrice){
        if(lottoPurchasePrice < LOTTO_PRICE || lottoPurchasePrice % LOTTO_PRICE != 0){

        }
    }

}
