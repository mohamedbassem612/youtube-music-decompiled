package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvl extends lxt implements lyq {
    public static final int DEBUG_INFO_FIELD_NUMBER = 2;
    public static final lvl DEFAULT_INSTANCE;
    public static final int MAX_JOINED_CHILDREN_PER_PARENT_TO_RETURN_FIELD_NUMBER = 8;
    public static final int NUM_PER_PAGE_FIELD_NUMBER = 1;
    public static final int NUM_TOTAL_BYTES_PER_PAGE_THRESHOLD_FIELD_NUMBER = 6;
    public static final int NUM_TO_SCORE_FIELD_NUMBER = 9;
    private static volatile lyu PARSER = null;
    public static final int RESULT_GROUPINGS_FIELD_NUMBER = 5;
    public static final int RESULT_GROUP_TYPE_FIELD_NUMBER = 7;
    public static final int SNIPPET_SPEC_FIELD_NUMBER = 3;
    public static final int TYPE_PROPERTY_MASKS_FIELD_NUMBER = 4;
    public int bitField0_;
    private boolean debugInfo_;
    public int maxJoinedChildrenPerParentToReturn_;
    public int numPerPage_ = 10;
    private int numToScore_;
    public int numTotalBytesPerPageThreshold_;
    public int resultGroupType_;
    public lye resultGroupings_;
    public lvk snippetSpec_;
    public lye typePropertyMasks_;

    static {
        lvl lvlVar = new lvl();
        DEFAULT_INSTANCE = lvlVar;
        lxt.E(lvl.class, lvlVar);
    }

    private lvl() {
        lyx lyxVar = lyx.a;
        this.typePropertyMasks_ = lyxVar;
        this.resultGroupings_ = lyxVar;
        this.numTotalBytesPerPageThreshold_ = Alert.DURATION_SHOW_INDEFINITELY;
        this.numToScore_ = 30000;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004\u001b\u0005\u001b\u0006င\u0003\u0007᠌\u0004\bင\u0005\tင\u0006", new Object[]{"bitField0_", "numPerPage_", "debugInfo_", "snippetSpec_", "typePropertyMasks_", lwk.class, "resultGroupings_", lvj.class, "numTotalBytesPerPageThreshold_", "resultGroupType_", ltw.r, "maxJoinedChildrenPerParentToReturn_", "numToScore_"});
        }
        if (i2 == 3) {
            return new lvl();
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
