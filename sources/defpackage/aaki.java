package defpackage;

import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Pair;
import j$.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aaki implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aaki(aakk aakkVar, wcn wcnVar, zwa zwaVar, Object obj, int i) {
        this.$cid = i;
        this.a = aakkVar;
        this.b = wcnVar;
        this.c = zwaVar;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, nar] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, wcn] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        int i = this.$cid;
        if (i == 0) {
            Optional optional = (Optional) obj;
            if (!optional.isPresent()) {
                return avmc.t(aanp.a);
            }
            Object obj2 = this.d;
            wep wepVar = (wep) optional.get();
            weh wehVar = wepVar.a;
            wej wejVar = wepVar.b;
            String str = ((amsz) obj2).f;
            amtc amtcVar = (amtc) wehVar;
            Set setE = aaje.e(wejVar);
            if (!setE.isEmpty()) {
                setE.remove(str);
            }
            ?? r4 = this.b;
            if (setE.isEmpty()) {
                return r4.a(amtcVar.b()).r(new aaki((aakk) this.a, (wcn) r4, (zwa) this.c, amtcVar, 2));
            }
            wer werVarE = r4.e();
            werVarE.i(amtcVar.b(), aaje.a(setE, wejVar));
            avmc avmcVarB = werVarE.d().B(avmc.t(aanp.a));
            aano aanoVar = new aano(aanp.b);
            aanoVar.d = 5;
            return avmcVarB.x(aanoVar.a());
        }
        if (i != 1) {
            if (i == 2) {
                if (!((agkz) obj).isEmpty()) {
                    return avmc.t(aanp.a);
                }
                amtc amtcVar2 = (amtc) this.d;
                if (amtcVar2.f()) {
                    if (!((aakk) this.a).e(this.c, amtcVar2.getLocalImageUrl())) {
                        aano aanoVar2 = new aano(aanp.b);
                        aanoVar2.d = 20;
                        return avmc.t(aanoVar2.a());
                    }
                }
                wer werVarE2 = this.b.e();
                werVarE2.j(amtcVar2.b());
                avmc avmcVarB2 = werVarE2.d().B(avmc.t(aanp.a));
                aano aanoVar3 = new aano(aanp.b);
                aanoVar3.d = 5;
                return avmcVarB2.x(aanoVar3.a());
            }
            Throwable th = (Throwable) obj;
            if (((AtomicBoolean) this.d).get()) {
                return avlr.A(th);
            }
            zvj zvjVarA = zvk.a();
            zvjVarA.j = 21;
            zvjVarA.i = 27;
            String message = th.getMessage() != null ? th.getMessage() : th.toString();
            ?? r1 = this.c;
            Object obj3 = this.a;
            zvjVarA.d(message);
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            abqq abqqVar = (abqq) obj3;
            ((zvl) abqqVar.j.io()).a(zvjVarA.a());
            ((tbt) abqqVar.a).c(new aayg());
            if (r1 != 0) {
                r1.n("sw_fb");
                tym.ag(tsa.STREAMING_WATCH_PART_FALLBACK);
            }
            return abqqVar.b(((abqx) abqqVar.b).b((wlo) this.b), r1);
        }
        String str2 = mkh.a;
        aihf aihfVarCreateBuilder = asms.a.createBuilder();
        String string = ((Uri) obj).toString();
        aihfVarCreateBuilder.copyOnWrite();
        asms asmsVar = (asms) aihfVarCreateBuilder.instance;
        string.getClass();
        asmsVar.b |= 1;
        asmsVar.c = string;
        zs zsVar = (zs) this.b;
        if (zsVar.b().getMimeTypeCount() > 0) {
            String mimeType = zsVar.b().getMimeType(0);
            aihfVarCreateBuilder.copyOnWrite();
            asms asmsVar2 = (asms) aihfVarCreateBuilder.instance;
            mimeType.getClass();
            asmsVar2.b |= 2;
            asmsVar2.d = mimeType;
        }
        Uri uriD = zsVar.d();
        if (uriD != null) {
            String string2 = uriD.toString();
            aihfVarCreateBuilder.copyOnWrite();
            asms asmsVar3 = (asms) aihfVarCreateBuilder.instance;
            string2.getClass();
            asmsVar3.b |= 4;
            asmsVar3.e = string2;
        }
        if (zsVar.b().getLabel() != null) {
            String string3 = zsVar.b().getLabel().toString();
            aihfVarCreateBuilder.copyOnWrite();
            asms asmsVar4 = (asms) aihfVarCreateBuilder.instance;
            string3.getClass();
            asmsVar4.b |= 8;
            asmsVar4.f = string3;
        }
        PersistableBundle extras = zsVar.b().getExtras();
        if (extras != null && extras.getBoolean("com.google.android.inputmethod.content.IS_STICKER", false)) {
            aihfVarCreateBuilder.copyOnWrite();
            asms asmsVar5 = (asms) aihfVarCreateBuilder.instance;
            asmsVar5.b |= 16;
            asmsVar5.g = true;
        }
        return Pair.create((asms) aihfVarCreateBuilder.build(), new omj(this.d).B(this.c.p(), (nsl) this.a));
    }

    public /* synthetic */ aaki(abqq abqqVar, AtomicBoolean atomicBoolean, xir xirVar, wlo wloVar, int i) {
        this.$cid = i;
        this.a = abqqVar;
        this.d = atomicBoolean;
        this.c = xirVar;
        this.b = wloVar;
    }

    public /* synthetic */ aaki(zs zsVar, nuc nucVar, nar narVar, nsl nslVar, int i) {
        this.$cid = i;
        this.b = zsVar;
        this.d = nucVar;
        this.c = narVar;
        this.a = nslVar;
    }
}
