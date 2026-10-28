package defpackage;

import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zxf extends zyn {
    private static final agrf l = agrf.h("com/google/android/libraries/youtube/net/ping/HttpPingRequest");
    private final zwa m;
    private final String n;
    private final Set o;
    private final mbc p;
    private final String q;
    private final long r;
    private final long s;
    private final List t;
    private final byte[] u;
    private final Map v;
    private final zya w;
    private final Set x;

    public zxf(int i, String str, String str2, long j, long j2, List list, byte[] bArr, Map map, tng tngVar, Set set, mbc mbcVar, int i2, zwa zwaVar, String str3, zya zyaVar, vxz vxzVar) {
        super(i, str, tngVar);
        boolean z = true;
        ahno.O(i != 1 || (map == null && bArr == null));
        if (map != null && bArr != null) {
            z = false;
        }
        long j3 = i2;
        ahno.O(z);
        if (vxzVar.c(7, 45634441L, 0L) > 0) {
            this.d = new tna((int) Duration.ofSeconds(j3).toMillis(), (int) vxzVar.c(7, 45634441L, 0L));
        } else {
            this.d = new tna((int) Duration.ofSeconds(j3).toMillis());
        }
        this.f = false;
        str2.getClass();
        this.q = str2;
        this.r = j;
        this.s = j2;
        this.t = list;
        this.u = bArr;
        this.v = map;
        this.o = set;
        this.p = mbcVar;
        zwaVar.getClass();
        this.m = zwaVar;
        this.n = str3;
        zyaVar.getClass();
        this.w = zyaVar;
        this.x = new HashSet();
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final zwa Q() {
        return this.m;
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final String R() {
        return this.n;
    }

    public final jrh S() {
        return (jrh) T().build();
    }

    public final aihf T() {
        aihf aihfVarCreateBuilder = jrh.a.createBuilder();
        String string = UUID.randomUUID().toString();
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar = (jrh) aihfVarCreateBuilder.instance;
        string.getClass();
        jrhVar.b |= 1;
        jrhVar.c = string;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar2 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar2.b |= 64;
        jrhVar2.j = this.q;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar3 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar3.b |= SemanticState.Focused;
        jrhVar3.k = this.r;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar4 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar4.b |= SemanticState.Modal;
        jrhVar4.o = this.s;
        long epochMilli = this.p.f().toEpochMilli();
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar5 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar5.b |= 32;
        jrhVar5.i = epochMilli;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar6 = (jrh) aihfVarCreateBuilder.instance;
        String str = this.a;
        str.getClass();
        int i = 8;
        jrhVar6.b |= 8;
        jrhVar6.e = str;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar7 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar7.b |= 4;
        jrhVar7.d = this.k - 1;
        String strK = this.m.k();
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar8 = (jrh) aihfVarCreateBuilder.instance;
        jrhVar8.b |= SemanticState.Obscured;
        jrhVar8.q = strK;
        aihfVarCreateBuilder.copyOnWrite();
        jrh jrhVar9 = (jrh) aihfVarCreateBuilder.instance;
        aihy aihyVar = jrhVar9.p;
        if (!aihyVar.c()) {
            jrhVar9.p = aihn.mutableCopy(aihyVar);
        }
        aifs.addAll(this.t, jrhVar9.p);
        Optional optional = this.h;
        yyk yykVar = new yyk(aihfVarCreateBuilder, i);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = yykVar.a;
            int i2 = ((tok) obj).az;
            aihf aihfVar = (aihf) obj2;
            aihfVar.copyOnWrite();
            jrh jrhVar10 = (jrh) aihfVar.instance;
            jrhVar10.b |= SemanticState.Multiline;
            jrhVar10.r = i2;
        }
        try {
            byte[] bArrAe = ae();
            if (bArrAe != null) {
                aigj aigjVarV = aigj.v(bArrAe);
                aihfVarCreateBuilder.copyOnWrite();
                jrh jrhVar11 = (jrh) aihfVarCreateBuilder.instance;
                aigjVarV.getClass();
                jrhVar11.b |= 16;
                jrhVar11.h = aigjVarV;
            }
        } catch (tmg e) {
            ((agrc) ((agrc) ((agrc) l.b()).j(e)).k("com/google/android/libraries/youtube/net/ping/HttpPingRequest", "createOfflineHttpRequestBuilder", (char) 163, "HttpPingRequest.java")).w("Auth failure: %s", e.getLocalizedMessage());
        }
        for (Map.Entry entry : e().entrySet()) {
            aihf aihfVarCreateBuilder2 = jrd.a.createBuilder();
            String str2 = (String) entry.getKey();
            aihfVarCreateBuilder2.copyOnWrite();
            jrd jrdVar = (jrd) aihfVarCreateBuilder2.instance;
            str2.getClass();
            jrdVar.b |= 1;
            jrdVar.c = str2;
            String str3 = (String) entry.getValue();
            aihfVarCreateBuilder2.copyOnWrite();
            jrd jrdVar2 = (jrd) aihfVarCreateBuilder2.instance;
            str3.getClass();
            jrdVar2.b |= 2;
            jrdVar2.d = str3;
            aihfVarCreateBuilder.copyOnWrite();
            jrh jrhVar12 = (jrh) aihfVarCreateBuilder.instance;
            jrd jrdVar3 = (jrd) aihfVarCreateBuilder2.build();
            jrdVar3.getClass();
            aiie aiieVar = jrhVar12.f;
            if (!aiieVar.c()) {
                jrhVar12.f = aihn.mutableCopy(aiieVar);
            }
            jrhVar12.f.add(jrdVar3);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            int i3 = ((amum) it.next()).m;
            aihfVarCreateBuilder.copyOnWrite();
            jrh jrhVar13 = (jrh) aihfVarCreateBuilder.instance;
            aihv aihvVar = jrhVar13.g;
            if (!aihvVar.c()) {
                jrhVar13.g = aihn.mutableCopy(aihvVar);
            }
            jrhVar13.g.h(i3);
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.zyn, defpackage.zyg
    public final boolean W() {
        return this.n != null;
    }

    @Override // defpackage.tns
    public final tnx aa(tnm tnmVar) {
        return tnx.e(null);
    }

    @Override // defpackage.tns
    public final Class ab() {
        return Void.class;
    }

    @Override // defpackage.tns
    public final /* bridge */ /* synthetic */ void ad(Object obj) {
    }

    @Override // defpackage.tmn, defpackage.tns
    public final byte[] ae() {
        byte[] bArr = this.u;
        if (bArr != null) {
            return bArr;
        }
        Map map = this.v;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return tgd.d(map, StandardCharsets.UTF_8).c();
    }

    @Override // defpackage.tmn, defpackage.tns
    public final Map e() {
        HashMap map = new HashMap();
        for (zxy zxyVar : this.o) {
            if (this.w.a(zxyVar.a())) {
                this.x.add(zxyVar.a());
                zxyVar.b(map, this);
            }
        }
        return map;
    }

    @Override // defpackage.tmn, defpackage.tns
    public final void y(toe toeVar) {
        tnm tnmVar = toeVar.b;
    }
}
