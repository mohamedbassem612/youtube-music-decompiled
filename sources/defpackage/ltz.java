package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltz extends lxt implements lyq {
    public static final ltz DEFAULT_INSTANCE;
    public static final int MAX_RESULTS_TO_RETRIEVE_FROM_PAGE_FIELD_NUMBER = 2;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    public int maxResultsToRetrieveFromPage_ = Alert.DURATION_SHOW_INDEFINITELY;
    public long nextPageToken_;

    static {
        ltz ltzVar = new ltz();
        DEFAULT_INSTANCE = ltzVar;
        lxt.E(ltz.class, ltzVar);
    }

    private ltz() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "nextPageToken_", "maxResultsToRetrieveFromPage_"});
        }
        if (i2 == 3) {
            return new ltz();
        }
        if (i2 == 4) {
            return new lxq(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
