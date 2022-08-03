package com.amazon.app.model;

public enum Celebrity {
    PRITAM,
    ARJIT_SINGH,
    AMITABH_BHATTACHARYA,
    TULSI_KUMAR,
    MITHOON,
    SAYEED_QUADRI,
    KANISHK_SETH,
    KAVITHA_SETH,
    B_PRAAK,
    NEETI_MOHAN,
    SANJAY_LEELA_BHANSALI,
    JAVED_ALI,
    ROCHAK_KOHLI,
    SHARDUL_RATHOD,
    ISHAAN_KHAN,
    TARA_SUTARIA,
    YO_YO_HONEY_SINGH,
    NIRAJ_SHREEDHAR,
    ANKIT_TIWARI,
    SAAJ_BHAAT,
    YASH,
    ANANYA_BHAT,
    VIJAY_PRAKASH,
    RAKSHITHA_SURESH,
    KALABHAIRAVA,
    M_M_KEERAVANI,
    SID_SRIRAM,
    ADITYA;

    @Override
    public String toString() {
        char[] ch = name().toLowerCase().replace("_", " ").toCharArray();
        for(int index = 0; index < ch.length; index++){
            if(index == 0 || ch[index-1]==' ')
                ch[index] = (char)(ch[index] - 32);
        }
        return String.valueOf(ch);
    }

}
