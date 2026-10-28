package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lvq extends lxt implements lvr {
    public static final int ACCOUNT_PROPERTIES_FIELD_NUMBER = 9;
    public static final int DATABASE_FIELD_NUMBER = 8;
    public static final lvq DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int IS_NESTED_ONLY_FIELD_NUMBER = 11;
    public static final int PARENT_TYPES_FIELD_NUMBER = 6;
    private static volatile lyu PARSER = null;
    public static final int PROPERTIES_DIGEST_FIELD_NUMBER = 10;
    public static final int PROPERTIES_FIELD_NUMBER = 4;
    public static final int SCHEMA_TYPE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 5;
    public lye accountProperties_;
    public int bitField0_;
    private boolean isNestedOnly_;
    public lye parentTypes_;
    private lxa propertiesDigest_;
    public lye properties_;
    public int version_;
    public String schemaType_ = "";
    public String description_ = "";
    public String database_ = "";

    static {
        lvq lvqVar = new lvq();
        DEFAULT_INSTANCE = lvqVar;
        lxt.E(lvq.class, lvqVar);
    }

    private lvq() {
        lyx lyxVar = lyx.a;
        this.properties_ = lyxVar;
        this.propertiesDigest_ = lxa.d;
        this.parentTypes_ = lyxVar;
        this.accountProperties_ = lyxVar;
    }

    @Override // defpackage.lxt
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new lyy(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ဈ\u0000\u0004\u001b\u0005င\u0004\u0006\u001a\u0007ဈ\u0001\bဈ\u0002\t\u001a\nည\u0003\u000bဇ\u0005", new Object[]{"bitField0_", "schemaType_", "properties_", luw.class, "version_", "parentTypes_", "description_", "database_", "accountProperties_", "propertiesDigest_", "isNestedOnly_"});
        }
        if (i2 == 3) {
            return new lvq();
        }
        if (i2 == 4) {
            return new lvp();
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }

    public final int b() {
        return this.parentTypes_.size();
    }

    public final int c() {
        return this.properties_.size();
    }

    public final luw d(int i) {
        return (luw) this.properties_.get(i);
    }

    public final String e(int i) {
        return (String) this.parentTypes_.get(i);
    }

    public final void f() {
        lye lyeVar = this.parentTypes_;
        if (lyeVar.c()) {
            return;
        }
        this.parentTypes_ = lxt.A(lyeVar);
    }

    @Override // defpackage.lvr
    public final String g() {
        throw null;
    }

    public final void h() {
        lye lyeVar = this.properties_;
        if (lyeVar.c()) {
            return;
        }
        this.properties_ = lxt.A(lyeVar);
    }
}
