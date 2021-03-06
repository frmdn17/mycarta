package me.muhammadfaisal.mycarta.v2.helper;

public class Constant {
    public static final String CARD_PATH = "CARDS";
    public static final String USER_PATH = "users";
    public static final String TRANSACTION_PATH = "TRANSACTIONS";
    public static final String IMAGE_PATH = "IMAGES";

    public static class URL {
        public static final String BASE_URL = "http://www.mycarta.muhammadfaisal.me/";
    }


    public static class CODE {
        
        public static final String YES = "YES";
        public static final String NO = "NO";
        
        public static final String INCOME = "INCOME";
        public static final String EXPENSE = "EXPENSE";
        
        //CATEGORY-CODE
        public static final String FOOD_AND_DRINK = "Food & Drink";
        public static final String BILLS = "Bills";
        public static final String SHOPPING = "Shopping";
        public static final String TRANSPORTATION = "Transportation";
        public static final String ELECTRONICS = "Electronics";
        public static final String HEALTH = "Health";
        public static final String EDUCATION = "Education";
        public static final String OFFICE = "Office";
        public static final String SALARY = "Salary";
        public static final String REWARDS = "Rewards";
        public static final String CASHBACK = "Cashback";
        public static final String INVESTMENT = "Investment";
        public static final String REFUND = "Refunds";
        public static final String LOTTERY = "Lottery";

        public static final String QRCODE = "QR_CODE";
        public static final String BARCODE = "BARCODE";
        public static final String PIN_INVALID = "400";
        public static final String USER = "User";
        public static final int GET_IMAGE_REQUEST = 1002;
    }

    public static class TAG {
        public static final String DETAIL_CARD_ACTIVITY_TAG = "DETAIL_CARD_ACTIVITY";
        public static final String HOME_ACTIVITY_TAG = "HOME_ACTIVITY";
        public static final String TRANSACTION_ADAPTER = "TRANSACTION_ADAPTER";
        public static final String EDITED_CARD_NUMBER = "EDITED_CARD_NUMBER";
        public static final String UPDATE_PROFILE = "UpdateProfile";
    }

    public class PREFERENCE {
        public static final String TRANSACTION = "Transaction";
    }

    public class KEY {
        public static final String BALANCE = "Balance";
        public static final String TITLE_MESSAGE = "TitleMessage";
        public static final String DESCRIPTION_MESSAGE = "DescriptionMessage";
        public static final String CODE = "Code";
        public static final String DELAY = "Delay";
    }
}
