package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vvr extends vvy {
    public final agev a;
    public final agev b;
    public final Map c;
    public final agev d;

    public vvr(aoda aodaVar, aocd aocdVar, aodb aodbVar, ajwo ajwoVar, Map map) {
        super(agev.h(tym.S(map, "com.google.android.libraries.youtube.innertube.endpoint.tag")));
        this.a = agev.h(aodaVar);
        this.b = agev.h(aocdVar);
        this.d = agev.h(ajwoVar);
        this.c = map == null ? agpn.b : map;
    }

    public static vvr a(aoda aodaVar) {
        aodaVar.getClass();
        return new vvr(aodaVar, null, null, null, null);
    }
}
