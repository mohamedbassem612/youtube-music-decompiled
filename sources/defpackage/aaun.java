package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaun {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public aaun(weo weoVar) {
        this.c = weoVar.a;
        this.f = weoVar.b;
        this.b = weoVar.c;
        this.d = weoVar.d;
        this.e = weoVar.e;
        this.a = weoVar.f;
    }

    public final aauo a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            Object obj3 = this.c;
            return new aauo((String) obj2, (aofb) obj, (byte[]) obj3, (String) this.d, (String) this.e, (Boolean) this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" videoId");
        }
        if (this.b == null) {
            sb.append(" offlineModeType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        if (r11 != null) goto L41;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, weh] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, weh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.weo b() {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaun.b():weo");
    }

    public final void c(wej wejVar) {
        if (wejVar == null) {
            throw new NullPointerException("Null currentMetadata");
        }
        this.e = wejVar;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null entityKey");
        }
        this.c = str;
    }

    public final void e(wej wejVar) {
        if (wejVar == null) {
            throw new NullPointerException("Null previousMetadata");
        }
        this.d = wejVar;
    }
}
