package com.amazon.app.mockers;

import com.amazon.app.model.Celebrity;
import com.amazon.app.model.Content;
import com.amazon.app.util.ContentType;
import com.amazon.app.util.Language;

import java.util.ArrayList;
import java.util.List;

public class ContentMocker {

    private static List<Content> contentList = null;

    private  ContentMocker(){}

    public static List<Content> getMocks(ContentType type){
        if(type == ContentType.BOOK) return null;

        if(contentList == null){
            contentList = new ArrayList<>();
            Content content1 = new Content();
            content1.setContentType(ContentType.SONG);
            content1.setContentName("Kesariya");
            content1.setAlbum("Brahmastra");
            content1.setLanguage(Language.HINDI);
            content1.setContentLength(268);
            List<Celebrity> c1 = new ArrayList<>();
            c1.add(Celebrity.PRITAM);
            c1.add(Celebrity.AMITABH_BHATTACHARYA);
            c1.add(Celebrity.ARJIT_SINGH);
            content1.setCelebrityList(c1);

            Content content2 = new Content();
            content2.setContentType(ContentType.SONG);
            content2.setContentName("Hum Nashe Mein Toh Nahi");
            content2.setAlbum("Bhool Bhulayya 2");
            content2.setContentLength(238);
            content2.setLanguage(Language.HINDI);
            List<Celebrity> c2 = new ArrayList<>();
            c2.add(Celebrity.PRITAM);
            c2.add(Celebrity.TULSI_KUMAR);
            c2.add(Celebrity.ARJIT_SINGH);
            content2.setCelebrityList(c2);

            Content content3 = new Content();
            content3.setContentType(ContentType.SONG);
            content3.setContentName("Kitni Haseen Hogi");
            content3.setAlbum("Hit - The First Case");
            content3.setContentLength(330);
            content3.setLanguage(Language.HINDI);
            List<Celebrity> c3 = new ArrayList<>();
            c3.add(Celebrity.MITHOON);
            c3.add(Celebrity.SAYEED_QUADRI);
            c3.add(Celebrity.ARJIT_SINGH);
            content3.setCelebrityList(c3);

            Content content4 = new Content();
            content4.setContentType(ContentType.SONG);
            content4.setContentName("Rangisari");
            content4.setAlbum("JuggJugg Jeeyo");
            content4.setContentLength(223);
            content4.setLanguage(Language.HINDI);
            List<Celebrity> c4 = new ArrayList<>();
            c4.add(Celebrity.KANISHK_SETH);
            c4.add(Celebrity.KAVITHA_SETH);
            content4.setCelebrityList(c4);

            Content content5 = new Content();
            content5.setContentType(ContentType.SONG);
            content5.setContentName("Bhool Bhulayya 2 Title Track");
            content5.setAlbum("Bhool Bhulayya 2");
            content5.setContentLength(211);
            content5.setLanguage(Language.HINDI);
            List<Celebrity> c5 = new ArrayList<>();
            c5.add(Celebrity.PRITAM);
            c5.add(Celebrity.NIRAJ_SHREEDHAR);
            content5.setCelebrityList(c5);

            Content content6 = new Content();
            content6.setContentType(ContentType.SONG);
            content6.setContentName("Fitoor");
            content6.setAlbum("Shamshera");
            content6.setLanguage(Language.HINDI);
            content6.setContentLength(308);
            List<Celebrity> c6 = new ArrayList<>();
            c6.add(Celebrity.MITHOON);
            c6.add(Celebrity.ARJIT_SINGH);
            content6.setCelebrityList(c6);

            Content content7 = new Content();
            content7.setContentType(ContentType.SONG);
            content7.setContentName("Accha Chalta hu");
            content7.setAlbum("Ae Dil he Mushkil");
            content7.setLanguage(Language.HINDI);
            content7.setContentLength(300);
            List<Celebrity> c7 = new ArrayList<>();
            c7.add(Celebrity.ARJIT_SINGH);
            content7.setCelebrityList(c7);

            Content content8 = new Content();
            content8.setContentType(ContentType.SONG);
            content8.setContentName("Chaand Baliyan");
            content8.setAlbum("Chaand Baliyan");
            content8.setContentLength(103);
            content8.setLanguage(Language.HINDI);
            List<Celebrity> c8 = new ArrayList<>();
            c8.add(Celebrity.ADITYA);
            content8.setCelebrityList(c8);

            Content content9 = new Content();
            content9.setContentType(ContentType.SONG);
            content9.setContentName("Mehbooba (Hindi)");
            content9.setAlbum("KGF 2");
            content9.setContentLength(103);
            content9.setLanguage(Language.HINDI);
            List<Celebrity> c9 = new ArrayList<>();
            c9.add(Celebrity.YASH);
            c9.add(Celebrity.ANANYA_BHAT);
            content9.setCelebrityList(c9);


            Content content11 = new Content();
            content11.setContentType(ContentType.SONG);
            content11.setContentName("Mehbooba (Kannada)");
            content11.setAlbum("KGF 2");
            content11.setContentLength(103);
            content11.setLanguage(Language.KANNADA);
            List<Celebrity> c11 = new ArrayList<>();
            c11.add(Celebrity.YASH);
            c11.add(Celebrity.ANANYA_BHAT);
            content11.setCelebrityList(c11);


            Content content12 = new Content();
            content12.setContentType(ContentType.SONG);
            content12.setContentName("Sanchariyagu Nee");
            content12.setAlbum("Love Mocktail 2");
            content12.setContentLength(253);
            content12.setLanguage(Language.KANNADA);
            List<Celebrity> c12 = new ArrayList<>();
            c12.add(Celebrity.RAKSHITHA_SURESH);
            c12.add(Celebrity.VIJAY_PRAKASH);
            content12.setCelebrityList(c12);

            Content content21 = new Content();
            content21.setContentType(ContentType.SONG);
            content21.setContentName("Naatu Naatu (RRR)");
            content21.setAlbum("RRR (Telugu)");
            content21.setContentLength(293);
            content21.setLanguage(Language.TELUGU);
            List<Celebrity> c21 = new ArrayList<>();
            c21.add(Celebrity.KALABHAIRAVA);
            c21.add(Celebrity.M_M_KEERAVANI);
            content21.setCelebrityList(c21);

            Content content22 = new Content();
            content22.setContentType(ContentType.SONG);
            content22.setContentName("Srivalli (Telugu)");
            content22.setAlbum("Pushpa (Telugu)");
            content22.setContentLength(273);
            content22.setLanguage(Language.TELUGU);
            List<Celebrity> c22 = new ArrayList<>();
            c22.add(Celebrity.SID_SRIRAM);
            content22.setCelebrityList(c22);


            Content content31 = new Content();
            content31.setContentType(ContentType.SONG);
            content31.setContentName("Srivalli (Tamil)");
            content31.setAlbum("Pushpa (Tamil)");
            content31.setContentLength(273);
            content31.setLanguage(Language.TAMIL);
            List<Celebrity> c31 = new ArrayList<>();
            c31.add(Celebrity.SID_SRIRAM);
            content31.setCelebrityList(c31);


            contentList.add(content1);
            contentList.add(content2);
            contentList.add(content3);
            contentList.add(content4);
            contentList.add(content5);
            contentList.add(content6);
            contentList.add(content7);
            contentList.add(content8);
            contentList.add(content9);
            contentList.add(content11);
            contentList.add(content12);
            contentList.add(content21);
            contentList.add(content22);
            contentList.add(content31);

            for(Content content : contentList){
                long h = content.getContentLength() / 60;
                long sec = content.getContentLength() - 60 * h;
                content.setContentLen(h + ":" + (sec < 10L ? "0" + sec : sec));
            }

            System.out.println(contentList.size() + "Contents created!");
        }
        return contentList;
    }

}
