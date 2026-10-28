package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ltr extends lxt implements lyq {
    public static final ltr DEFAULT_INSTANCE;
    public static final int INDEXABLE_NESTED_PROPERTIES_LIST_FIELD_NUMBER = 2;
    public static final int INDEX_NESTED_PROPERTIES_FIELD_NUMBER = 1;
    private static volatile lyu PARSER;
    public int bitField0_;
    public boolean indexNestedProperties_;
    public lye indexableNestedPropertiesList_ = lyx.a;

    static {
        ltr ltrVar = new ltr();
        DEFAULT_INSTANCE = ltrVar;
        lxt.E(ltr.class, ltrVar);
    }

    private ltr() {
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"bitField0_", "indexNestedProperties_", "indexableNestedPropertiesList_"});
        }
        if (i2 == 3) {
            return new ltr();
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
