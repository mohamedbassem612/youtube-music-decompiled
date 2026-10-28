package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aelp implements twi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ aelp(aels aelsVar, boolean z, String str, ajwo ajwoVar, Map map, int i) {
        this.$cid = i;
        this.b = aelsVar;
        this.a = z;
        this.c = str;
        this.d = ajwoVar;
        this.e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, vob] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            ((aels) this.b).e((alqp) obj, this.a, (String) this.c, ((ajwo) this.d).c, this.e);
            return;
        }
        wru wruVar = (wru) obj;
        ?? r0 = this.b;
        if (wruVar == null) {
            xdi.f(r0, false);
            return;
        }
        Object obj2 = this.d;
        aoll aollVar = wruVar.a;
        xdi xdiVar = (xdi) obj2;
        xdiVar.c(aollVar);
        r0.p().d(new xgj(aollVar.g, (amud) null));
        aoln aolnVar = aollVar.d;
        if (aolnVar == null) {
            aolnVar = aoln.a;
        }
        akuj akujVar = aolnVar.b == 138681066 ? (akuj) aolnVar.c : akuj.b;
        Object obj3 = this.e;
        aihf builder = akujVar.toBuilder();
        akud akudVar = ((aqzk) obj3).e;
        if (akudVar == null) {
            akudVar = akud.a;
        }
        Object obj4 = this.c;
        boolean z = this.a;
        builder.copyOnWrite();
        akuj akujVar2 = (akuj) builder.instance;
        akudVar.getClass();
        akujVar2.f = akudVar;
        akujVar2.e = 18;
        akuj akujVar3 = (akuj) builder.build();
        if (z) {
            r0.z(akujVar3, (ajwo) obj4);
        } else {
            r0.M(akujVar3, (ajwo) obj4);
        }
        if ((aollVar.b & 64) != 0) {
            ((Optional) xdiVar.j).isPresent();
        }
        xdi.f(r0, false);
    }

    public /* synthetic */ aelp(xdi xdiVar, vob vobVar, aqzk aqzkVar, boolean z, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.d = xdiVar;
        this.b = vobVar;
        this.e = aqzkVar;
        this.a = z;
        this.c = ajwoVar;
    }
}
