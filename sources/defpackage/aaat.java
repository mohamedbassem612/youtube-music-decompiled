package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaat implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aaat(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r12v67, types: [java.lang.Object, xgz] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        int i = 8;
        aknx aknxVar = null;
        int i2 = 7;
        int i3 = 5;
        switch (this.$cid) {
            case 0:
                aihf builder = ((atpq) obj).toBuilder();
                Object obj2 = this.a;
                aaar aaarVar = (aaar) this.b;
                builder.cN("com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(String.valueOf(obj2)), aaarVar.a);
                builder.cO("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(String.valueOf(obj2)), aaarVar.b);
                return (atpq) builder.build();
            case 1:
                ((zzs) ((zzr) this.b).a).a(((aigj) obj).G(), (String) this.a);
                return 0;
            case 2:
                axsu axsuVar = (axsu) obj;
                if (axsuVar.b.size() > 100) {
                    throw new IllegalStateException("Too many payloads");
                }
                ?? r0 = this.b;
                Object obj3 = this.a;
                aihf builder2 = axsuVar.toBuilder();
                aigj byteString = r0.toByteString();
                obj3.getClass();
                builder2.copyOnWrite();
                ((axsu) builder2.instance).a().put(obj3, byteString);
                return (axsu) builder2.build();
            case 3:
                return agev.h(((aaew) ((aady) this.b).h.io()).f((String) this.a));
            case 4:
                Optional optional = (Optional) obj;
                boolean zIsPresent = optional.isPresent();
                Object obj4 = this.b;
                Object obj5 = this.a;
                aoho aohoVarD = zIsPresent ? ((aohq) optional.get()).d() : aohq.e(aaea.h(((aaml) obj5).g()));
                aihf aihfVarCreateBuilder = aqdp.a.createBuilder();
                aaml aamlVar = (aaml) obj5;
                wgs wgsVar = aamlVar.c;
                aigj byteString2 = wgsVar.b.toByteString();
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar.b |= 16;
                aqdpVar.g = byteString2;
                long j = aamlVar.e;
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar2 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar2.b |= 1;
                aqdpVar2.c = j;
                long jB = aamlVar.b();
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar3 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar3.b |= 2;
                aqdpVar3.d = jB;
                int i4 = wgsVar.aa() ? 4 : wgsVar.I() ? 2 : 3;
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar4 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar4.e = i4 - 1;
                aqdpVar4.b |= 4;
                int i5 = j >= aamlVar.b() ? 3 : 2;
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar5 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar5.f = i5 - 1;
                aqdpVar5.b |= 8;
                int iE = wgsVar.e();
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar6 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar6.b |= 32;
                aqdpVar6.h = iE;
                long jK = wgsVar.k();
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar7 = (aqdp) aihfVarCreateBuilder.instance;
                aqdpVar7.b |= SemanticState.Focused;
                aqdpVar7.j = jK;
                String strC = wgsVar.C();
                aihfVarCreateBuilder.copyOnWrite();
                aqdp aqdpVar8 = (aqdp) aihfVarCreateBuilder.instance;
                strC.getClass();
                aqdpVar8.b |= 64;
                aqdpVar8.i = strC;
                aohoVarD.a.bZ((aqdp) aihfVarCreateBuilder.build());
                try {
                    wer werVarE = ((aaea) obj4).b.e();
                    werVarE.e(aohoVarD.ao());
                    werVarE.b().G();
                    return Boolean.TRUE;
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) aaea.a.b()).j(e)).k("com/google/android/libraries/youtube/offline/client/EntitiesBasedStreamStore", "insertStreamFunction", (char) 129, "EntitiesBasedStreamStore.java")).t("Issue with insertStream in entityStore");
                    return Boolean.FALSE;
                }
            case 5:
                Optional optional2 = (Optional) obj;
                if (optional2.isEmpty()) {
                    return Boolean.FALSE;
                }
                aknu aknuVar = (aknu) optional2.get();
                for (aknx aknxVar2 : aknuVar.getLicenses()) {
                    if ((aknxVar2.b & SemanticState.Focused) != 0) {
                        if (aknxVar2.f.equals(this.a)) {
                            aknxVar = aknxVar2;
                            if (aknxVar != null || aknxVar.d) {
                                return Boolean.FALSE;
                            }
                            Instant instantF = ((abxv) this.b).b.f();
                            return aknuVar.getPlaybackStartSeconds().longValue() > 0 ? Boolean.valueOf(instantF.isAfter(Instant.ofEpochSecond(aknuVar.getPlaybackStartSeconds().longValue() + aknxVar.c))) : Boolean.valueOf(instantF.isAfter(Instant.ofEpochSecond(aknuVar.getLicenseExpirySeconds().longValue())));
                        }
                    }
                }
                if (aknxVar != null) {
                }
                return Boolean.FALSE;
            case 6:
                return ((ug) obj).g((String) this.a, (tl) this.b);
            case 7:
                return aakw.e((agke) this.b, (alub) obj, (aanp[]) this.a);
            case 8:
                return aakw.e((agke) this.b, (alub) obj, (aanp[]) this.a);
            case 9:
                agjz agjzVar = new agjz(4);
                Stream stream = Collection.EL.stream(this.b);
                Object obj6 = this.a;
                stream.filter(new aajl(obj6, 6)).map(new aakc(11)).forEach(new aaer(agjzVar, i3));
                Collection.EL.stream((agke) obj).filter(new aajl(obj6, i2)).forEach(new aaer(agjzVar, i3));
                return agjzVar.g();
            case 10:
                agjz agjzVar2 = new agjz(4);
                Stream stream2 = Collection.EL.stream(this.b);
                Object obj7 = this.a;
                stream2.filter(new aajl(obj7, i3)).map(new aakc(10)).forEach(new aaer(agjzVar2, i2));
                Collection.EL.stream((agke) obj).filter(new aajl(obj7, i)).forEach(new aaer(agjzVar2, i2));
                return agjzVar2.g();
            case 11:
                aodx aodxVar = (aodx) obj;
                Object obj8 = this.a;
                aihf aihfVar = (aihf) obj8;
                aihfVar.copyOnWrite();
                aoec aoecVar = (aoec) aihfVar.instance;
                aoec aoecVar2 = aoec.a;
                aodxVar.getClass();
                aoecVar.f = aodxVar;
                aoecVar.b |= SemanticState.ReadOnly;
                long jB2 = ((aalp) this.b).l.b();
                aihfVar.copyOnWrite();
                aoec aoecVar3 = (aoec) aihfVar.instance;
                aoecVar3.b |= 1;
                aoecVar3.e = jB2;
                return obj8;
            case 12:
                abpw abpwVar = (abpw) obj;
                return ((aboq) this.a).a.v(abpwVar.a, abpwVar.c, null, abpwVar.d, (abnp) this.b);
            case 13:
                abww abwwVar = (abww) this.a;
                abwt abwtVar = (abwt) obj;
                if (!((zwb) abwwVar.h.io()).e().equals(this.b)) {
                    return null;
                }
                if ((abwtVar.b & 1) != 0) {
                    boolean z = abwtVar.c;
                    abwwVar.a.kk(Optional.of(Boolean.valueOf(z)));
                    abwwVar.p.d(z);
                } else {
                    awku awkuVar = abwwVar.a;
                    if (awkuVar.aG()) {
                        awkuVar.kk(Optional.empty());
                        abwwVar.p.b();
                    }
                }
                if ((abwtVar.b & 2) != 0) {
                    String str = abwtVar.d;
                    abwwVar.b.kk(Optional.of(str));
                    abwwVar.p.e(str);
                    return null;
                }
                awku awkuVar2 = abwwVar.b;
                if (!awkuVar2.aG()) {
                    return null;
                }
                awkuVar2.kk(Optional.empty());
                abwwVar.p.c();
                return null;
            case 14:
                return ((acga) this.b).f((Class) this.a, (acfx) obj);
            case 15:
                aihf aihfVarCreateBuilder2 = amdo.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amdo amdoVar = (amdo) aihfVarCreateBuilder2.instance;
                amdoVar.c = ((amef) obj).e;
                amdoVar.b |= 2;
                amdo amdoVar2 = (amdo) aihfVarCreateBuilder2.build();
                aihf aihfVarCreateBuilder3 = amdd.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amdd amddVar = (amdd) aihfVarCreateBuilder3.instance;
                amdoVar2.getClass();
                amddVar.o = amdoVar2;
                amddVar.c |= 1;
                amdd amddVar2 = (amdd) aihfVarCreateBuilder3.build();
                xgn xgnVarHB = ((acpe) this.a).b.hB();
                ?? r12 = this.b;
                xgnVarHB.d(r12);
                xgnVarHB.A(r12, amddVar2);
                return aher.a;
            default:
                ((aczb) this.b).j((albe) this.a, new zaz((ResourceLoader) obj, 20));
                return null;
        }
    }

    public /* synthetic */ aaat(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
