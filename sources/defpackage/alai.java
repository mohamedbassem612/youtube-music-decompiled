package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum alai implements aihr {
    FLOW_TYPE_UNKNOWN(0),
    FLOW_TYPE_NOTAIRE(1),
    FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED(2),
    FLOW_TYPE_OFFLINE_ORCHESTRATION(3),
    FLOW_TYPE_PLAYBACK_QUEUE(4),
    FLOW_TYPE_OFFLINE_TRANSFER_SERVICE(5),
    FLOW_TYPE_IN_APP_UPDATE(6),
    FLOW_TYPE_SHORTS_CREATION(7),
    FLOW_TYPE_MDX_CONNECTION(8),
    FLOW_TYPE_CHIME_REGISTRATION(9),
    FLOW_TYPE_MDX_RECEIVER_CONNECTION(10),
    FLOW_TYPE_PREMIUM_MULTI_STEP_PURCHASE(11),
    FLOW_TYPE_PARENT_TOOLS_ONBOARDING(12),
    FLOW_TYPE_LIVE_STREAMING(13),
    FLOW_TYPE_HASHTAG_SUGGESTIONS(14),
    FLOW_TYPE_KIDS_ONBOARDING(15),
    FLOW_TYPE_TOU_APPEAL(16),
    FLOW_TYPE_DRAG_AND_DROP(17),
    FLOW_TYPE_FEATURE_ENABLEMENT(18),
    FLOW_TYPE_SOCIAL_SUGGESTIONS(19),
    FLOW_TYPE_LIVE_STREAMING_ADS_INSERTION(20),
    FLOW_TYPE_IAP(21),
    FLOW_TYPE_SHOPPING_CHECKOUT(22),
    FLOW_TYPE_YPC_CANCELLATION(23),
    FLOW_TYPE_YPC_BROWSE_OFFERS(24),
    FLOW_TYPE_UNPLUGGED_EPG_SORT(25),
    FLOW_TYPE_MDX_STREAM_TRANSFER(26),
    FLOW_TYPE_PDG_BUY_FLOW(27),
    FLOW_TYPE_YPC_PURCHASE(28),
    FLOW_TYPE_LIVE_STREAMING_CONFERENCE(29),
    FLOW_TYPE_ACTION_SHEET(30),
    FLOW_TYPE_WEB_VIEW(31),
    FLOW_TYPE_CREATOR_VIDEO_SUGGESTIONS(32),
    FLOW_TYPE_YTV_INBOARDING(33),
    FLOW_TYPE_YTV_OFFBOARDING(76),
    FLOW_TYPE_PRODUCER_EXPORT(34),
    FLOW_TYPE_YTS_DOWNLOAD_MY_VIDEO(35),
    FLOW_TYPE_MINI_APP(36),
    FLOW_TYPE_MINI_APP_DEVELOPER_PORTAL(57),
    FLOW_TYPE_SHOPPING_CART(37),
    FLOW_TYPE_GENERIC_CUI(38),
    FLOW_TYPE_MOBILE_LIVE_STREAMING_ENABLEMENT(39),
    FLOW_TYPE_YTBC_BCX_OFFER(40),
    FLOW_TYPE_SPONSORSHIPS_PURCHASE(41),
    FLOW_TYPE_SPONSORSHIPS_ONBOARDING(49),
    FLOW_TYPE_SPONSORSHIPS_PRICE_CHANGE(77),
    FLOW_TYPE_SPONSORSHIPS_CREATOR_INCENTIVES(79),
    FLOW_TYPE_YPC_ACQUISITION(42),
    FLOW_TYPE_MOBILE_LIVE_STREAMING(43),
    FLOW_TYPE_MOBILE_LIVE_STREAMING_GUEST(52),
    FLOW_TYPE_ADBLOCK_ENFORCEMENT(44),
    FLOW_TYPE_FEED(45),
    FLOW_TYPE_YPC_VOUCHER_REDEMPTION(46),
    FLOW_TYPE_REAUTH(47),
    FLOW_TYPE_LIVE_CHAT_ENGAGEMENT(48),
    FLOW_TYPE_MDX_DEVICE_SELECTION(50),
    FLOW_TYPE_YPC_PRICE_CHANGE(51),
    FLOW_TYPE_MDX_SIGN_IN(53),
    FLOW_TYPE_PRODUCER_IMPORT(54),
    FLOW_TYPE_POSTS_CREATION(55),
    FLOW_TYPE_ACCOUNT_TAKEOVER_RECOVERY(56),
    FLOW_TYPE_PRODUCER_MSR_RESET(58),
    FLOW_TYPE_PRODUCER_IMPORT_PREVIEW(59),
    FLOW_TYPE_PRODUCER_VOICEOVER(60),
    FLOW_TYPE_PRODUCER_MONTAGE(61),
    FLOW_TYPE_PRODUCER_TEMPLATES(62),
    FLOW_TYPE_MEDIA_ENGINE_PLAYBACK(63),
    FLOW_TYPE_MEDIA_ENGINE_PLAYER_BUFFERING(64),
    FLOW_TYPE_PRODUCER_EXTRACT_AUDIO(65),
    FLOW_TYPE_PRODUCER_STORYGEN(66),
    FLOW_TYPE_PRODUCER_REVERSE(67),
    FLOW_TYPE_PRODUCER_AUDIO_SLIP_EDIT(68),
    FLOW_TYPE_PRODUCER_SOUND_PICKER(69),
    FLOW_TYPE_PRODUCER_TRANSMUX(70),
    FLOW_TYPE_PRODUCER_AUDIO_IMPORT_FROM_FILES(71),
    FLOW_TYPE_MUSIC_QUEUE_RESTORATION(72),
    FLOW_TYPE_MULTIVIEW_BUILDER(73),
    FLOW_TYPE_YTLR_PIN_CODE(74),
    FLOW_TYPE_CHILD_ONBOARDING(75),
    FLOW_TYPE_YTLR_APP_START(78),
    FLOW_TYPE_PRODUCER_FRONTEND_SERVICE_FETCH(80),
    FLOW_TYPE_GENERATIVE_LIKENESS(81),
    FLOW_TYPE_PRODUCER_INSPIRATION_FEED(82),
    FLOW_TYPE_PRODUCER_LIKENESS_CREATION(83),
    FLOW_TYPE_PRODUCER_LIKENESS_MANAGEMENT(84);

    public final int aH;

    alai(int i) {
        this.aH = i;
    }

    public static alai a(int i) {
        switch (i) {
            case 0:
                return FLOW_TYPE_UNKNOWN;
            case 1:
                return FLOW_TYPE_NOTAIRE;
            case 2:
                return FLOW_TYPE_OFFLINE_TRANSFER_STATUS_CHANGED;
            case 3:
                return FLOW_TYPE_OFFLINE_ORCHESTRATION;
            case 4:
                return FLOW_TYPE_PLAYBACK_QUEUE;
            case 5:
                return FLOW_TYPE_OFFLINE_TRANSFER_SERVICE;
            case 6:
                return FLOW_TYPE_IN_APP_UPDATE;
            case 7:
                return FLOW_TYPE_SHORTS_CREATION;
            case 8:
                return FLOW_TYPE_MDX_CONNECTION;
            case 9:
                return FLOW_TYPE_CHIME_REGISTRATION;
            case 10:
                return FLOW_TYPE_MDX_RECEIVER_CONNECTION;
            case 11:
                return FLOW_TYPE_PREMIUM_MULTI_STEP_PURCHASE;
            case 12:
                return FLOW_TYPE_PARENT_TOOLS_ONBOARDING;
            case 13:
                return FLOW_TYPE_LIVE_STREAMING;
            case 14:
                return FLOW_TYPE_HASHTAG_SUGGESTIONS;
            case 15:
                return FLOW_TYPE_KIDS_ONBOARDING;
            case 16:
                return FLOW_TYPE_TOU_APPEAL;
            case 17:
                return FLOW_TYPE_DRAG_AND_DROP;
            case 18:
                return FLOW_TYPE_FEATURE_ENABLEMENT;
            case 19:
                return FLOW_TYPE_SOCIAL_SUGGESTIONS;
            case 20:
                return FLOW_TYPE_LIVE_STREAMING_ADS_INSERTION;
            case 21:
                return FLOW_TYPE_IAP;
            case 22:
                return FLOW_TYPE_SHOPPING_CHECKOUT;
            case 23:
                return FLOW_TYPE_YPC_CANCELLATION;
            case 24:
                return FLOW_TYPE_YPC_BROWSE_OFFERS;
            case 25:
                return FLOW_TYPE_UNPLUGGED_EPG_SORT;
            case 26:
                return FLOW_TYPE_MDX_STREAM_TRANSFER;
            case 27:
                return FLOW_TYPE_PDG_BUY_FLOW;
            case 28:
                return FLOW_TYPE_YPC_PURCHASE;
            case 29:
                return FLOW_TYPE_LIVE_STREAMING_CONFERENCE;
            case 30:
                return FLOW_TYPE_ACTION_SHEET;
            case 31:
                return FLOW_TYPE_WEB_VIEW;
            case 32:
                return FLOW_TYPE_CREATOR_VIDEO_SUGGESTIONS;
            case 33:
                return FLOW_TYPE_YTV_INBOARDING;
            case 34:
                return FLOW_TYPE_PRODUCER_EXPORT;
            case 35:
                return FLOW_TYPE_YTS_DOWNLOAD_MY_VIDEO;
            case 36:
                return FLOW_TYPE_MINI_APP;
            case 37:
                return FLOW_TYPE_SHOPPING_CART;
            case 38:
                return FLOW_TYPE_GENERIC_CUI;
            case 39:
                return FLOW_TYPE_MOBILE_LIVE_STREAMING_ENABLEMENT;
            case 40:
                return FLOW_TYPE_YTBC_BCX_OFFER;
            case 41:
                return FLOW_TYPE_SPONSORSHIPS_PURCHASE;
            case 42:
                return FLOW_TYPE_YPC_ACQUISITION;
            case 43:
                return FLOW_TYPE_MOBILE_LIVE_STREAMING;
            case 44:
                return FLOW_TYPE_ADBLOCK_ENFORCEMENT;
            case 45:
                return FLOW_TYPE_FEED;
            case 46:
                return FLOW_TYPE_YPC_VOUCHER_REDEMPTION;
            case 47:
                return FLOW_TYPE_REAUTH;
            case 48:
                return FLOW_TYPE_LIVE_CHAT_ENGAGEMENT;
            case 49:
                return FLOW_TYPE_SPONSORSHIPS_ONBOARDING;
            case 50:
                return FLOW_TYPE_MDX_DEVICE_SELECTION;
            case 51:
                return FLOW_TYPE_YPC_PRICE_CHANGE;
            case 52:
                return FLOW_TYPE_MOBILE_LIVE_STREAMING_GUEST;
            case 53:
                return FLOW_TYPE_MDX_SIGN_IN;
            case 54:
                return FLOW_TYPE_PRODUCER_IMPORT;
            case 55:
                return FLOW_TYPE_POSTS_CREATION;
            case 56:
                return FLOW_TYPE_ACCOUNT_TAKEOVER_RECOVERY;
            case 57:
                return FLOW_TYPE_MINI_APP_DEVELOPER_PORTAL;
            case 58:
                return FLOW_TYPE_PRODUCER_MSR_RESET;
            case 59:
                return FLOW_TYPE_PRODUCER_IMPORT_PREVIEW;
            case 60:
                return FLOW_TYPE_PRODUCER_VOICEOVER;
            case 61:
                return FLOW_TYPE_PRODUCER_MONTAGE;
            case 62:
                return FLOW_TYPE_PRODUCER_TEMPLATES;
            case 63:
                return FLOW_TYPE_MEDIA_ENGINE_PLAYBACK;
            case 64:
                return FLOW_TYPE_MEDIA_ENGINE_PLAYER_BUFFERING;
            case 65:
                return FLOW_TYPE_PRODUCER_EXTRACT_AUDIO;
            case 66:
                return FLOW_TYPE_PRODUCER_STORYGEN;
            case 67:
                return FLOW_TYPE_PRODUCER_REVERSE;
            case 68:
                return FLOW_TYPE_PRODUCER_AUDIO_SLIP_EDIT;
            case 69:
                return FLOW_TYPE_PRODUCER_SOUND_PICKER;
            case 70:
                return FLOW_TYPE_PRODUCER_TRANSMUX;
            case 71:
                return FLOW_TYPE_PRODUCER_AUDIO_IMPORT_FROM_FILES;
            case 72:
                return FLOW_TYPE_MUSIC_QUEUE_RESTORATION;
            case 73:
                return FLOW_TYPE_MULTIVIEW_BUILDER;
            case 74:
                return FLOW_TYPE_YTLR_PIN_CODE;
            case 75:
                return FLOW_TYPE_CHILD_ONBOARDING;
            case 76:
                return FLOW_TYPE_YTV_OFFBOARDING;
            case 77:
                return FLOW_TYPE_SPONSORSHIPS_PRICE_CHANGE;
            case 78:
                return FLOW_TYPE_YTLR_APP_START;
            case 79:
                return FLOW_TYPE_SPONSORSHIPS_CREATOR_INCENTIVES;
            case 80:
                return FLOW_TYPE_PRODUCER_FRONTEND_SERVICE_FETCH;
            case 81:
                return FLOW_TYPE_GENERATIVE_LIKENESS;
            case 82:
                return FLOW_TYPE_PRODUCER_INSPIRATION_FEED;
            case 83:
                return FLOW_TYPE_PRODUCER_LIKENESS_CREATION;
            case 84:
                return FLOW_TYPE_PRODUCER_LIKENESS_MANAGEMENT;
            default:
                return null;
        }
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.aH;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.aH);
    }
}
