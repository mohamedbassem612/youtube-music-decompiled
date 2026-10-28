package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ntw {
    public final agkh a = new agkh(4);
    public awmd b;
    public String c;
    public ntu d;
    public nug e;
    public nvy f;
    public agke g;
    public byte h;
    public adfx i;
    private boolean j;
    private boolean k;
    private agkj l;

    public final ntx a() {
        awmd awmdVar;
        String str;
        ntu ntuVar;
        nug nugVar;
        agkj agkjVarD = this.a.d(false);
        this.l = agkjVarD;
        if (this.h == 31 && (awmdVar = this.b) != null && (str = this.c) != null && (ntuVar = this.d) != null && (nugVar = this.e) != null && agkjVarD != null) {
            return new ntx(awmdVar, str, ntuVar, nugVar, this.i, this.j, this.f, this.k, this.g, agkjVarD);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" converterProvider");
        }
        if (this.c == null) {
            sb.append(" logTag");
        }
        if (this.d == null) {
            sb.append(" perfLoggerFactory");
        }
        if (this.e == null) {
            sb.append(" elementsLifeCycleLogger");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useIncrementalMount");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableLithoReconciliation");
        }
        if ((this.h & 4) == 0) {
            sb.append(" useSizeSpec");
        }
        if ((this.h & 8) == 0) {
            sb.append(" nestedScrollingEnabled");
        }
        if ((this.h & 16) == 0) {
            sb.append(" clearComponentOnDetach");
        }
        if (this.l == null) {
            sb.append(" userDataMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.h = (byte) (this.h | 8);
    }

    public final void c(boolean z) {
        this.j = z;
        this.h = (byte) (this.h | 1);
    }
}
