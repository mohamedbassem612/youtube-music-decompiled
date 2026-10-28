package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acho {
    public boolean a;
    public final String b;
    public alvl c;
    public final byte[] d;
    public aigj e;
    public ajwo f;
    public alve g;
    public aigj h;
    public aigj i;
    public final String j;
    public String k;
    public String l;
    public List m = agpi.a;
    private final aopm n;

    public acho(achq achqVar) {
        alve alveVar;
        String str = achqVar.a;
        str.getClass();
        this.b = str;
        this.c = achqVar.c;
        this.d = achqVar.b;
        this.e = achqVar.f;
        this.n = achqVar.g;
        this.j = achqVar.l;
        this.k = achqVar.h;
        this.l = achqVar.i;
        this.h = achqVar.m;
        alvf alvfVar = achqVar.e;
        if (alvfVar != null) {
            alveVar = alvfVar.j;
            if (alveVar == null) {
                alveVar = alve.a;
            }
        } else {
            alveVar = null;
        }
        this.g = alveVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    public final achu a() {
        Object obj;
        Object obj2;
        oqe oqeVar = new oqe(this, 20);
        acht achtVar = new acht();
        achtVar.a = oqeVar;
        achtVar.a(agpi.a);
        achtVar.b = this.b;
        achtVar.g = this.n;
        achtVar.c = this.c;
        achtVar.d = this.f;
        achtVar.f = this.g;
        achtVar.a(this.m);
        achtVar.h = this.i;
        achtVar.i = this.k;
        achtVar.j = this.l;
        achtVar.k = this.h;
        ?? r3 = achtVar.a;
        if (r3 == 0 || (obj = achtVar.b) == null || (obj2 = achtVar.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (achtVar.a == null) {
                sb.append(" isDeadProvider");
            }
            if (achtVar.b == null) {
                sb.append(" videoId");
            }
            if (achtVar.e == null) {
                sb.append(" cueRangeSets");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj3 = achtVar.c;
        Object obj4 = achtVar.d;
        Object obj5 = achtVar.f;
        Object obj6 = achtVar.g;
        Object obj7 = achtVar.h;
        aigj aigjVar = (aigj) obj7;
        alve alveVar = (alve) obj5;
        ajwo ajwoVar = (ajwo) obj4;
        return new achu(r3, (String) obj, (alvl) obj3, ajwoVar, (agke) obj2, alveVar, (aopm) obj6, aigjVar, (String) achtVar.i, (String) achtVar.j, (aigj) achtVar.k);
    }
}
