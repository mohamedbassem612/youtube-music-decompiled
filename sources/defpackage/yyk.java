package defpackage;

import android.content.Intent;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.ClientErrorOuterClass$ErrorMetaData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yyk implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ yyk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v46, types: [axsp, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        switch (this.$cid) {
            case 0:
                ((yvr) this.a).b((Float) obj);
                break;
            case 1:
                ((yvr) this.a).h((Float) obj);
                break;
            case 2:
                ((yyu) this.a).i.h.c().l("aact", Integer.toString(((Integer) obj).intValue()));
                break;
            case 3:
                a$$ExternalSyntheticApiModelOutline0.m7m(obj).r(this.a);
                break;
            case 4:
                aksg aksgVar = (aksg) obj;
                aihf aihfVar = (aihf) this.a;
                aihfVar.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData = (ClientErrorOuterClass$ErrorMetaData) aihfVar.instance;
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData2 = ClientErrorOuterClass$ErrorMetaData.a;
                aksgVar.getClass();
                clientErrorOuterClass$ErrorMetaData.j = aksgVar;
                clientErrorOuterClass$ErrorMetaData.b |= SemanticState.Hidden;
                break;
            case 5:
                aned anedVar = (aned) obj;
                aihf aihfVar2 = (aihf) this.a;
                aihfVar2.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData3 = (ClientErrorOuterClass$ErrorMetaData) aihfVar2.instance;
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData4 = ClientErrorOuterClass$ErrorMetaData.a;
                anedVar.getClass();
                clientErrorOuterClass$ErrorMetaData3.k = anedVar;
                clientErrorOuterClass$ErrorMetaData3.b |= SemanticState.LiveRegion;
                break;
            case 6:
                apeo apeoVar = (apeo) obj;
                aihf aihfVar3 = (aihf) this.a;
                aihfVar3.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData5 = (ClientErrorOuterClass$ErrorMetaData) aihfVar3.instance;
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData6 = ClientErrorOuterClass$ErrorMetaData.a;
                apeoVar.getClass();
                clientErrorOuterClass$ErrorMetaData5.m = apeoVar;
                clientErrorOuterClass$ErrorMetaData5.b |= 16384;
                break;
            case 7:
                aokx aokxVar = (aokx) obj;
                aihf aihfVar4 = (aihf) this.a;
                aihfVar4.copyOnWrite();
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData7 = (ClientErrorOuterClass$ErrorMetaData) aihfVar4.instance;
                ClientErrorOuterClass$ErrorMetaData clientErrorOuterClass$ErrorMetaData8 = ClientErrorOuterClass$ErrorMetaData.a;
                aokxVar.getClass();
                clientErrorOuterClass$ErrorMetaData7.n = aokxVar;
                clientErrorOuterClass$ErrorMetaData7.b |= 131072;
                break;
            case 8:
                int i = ((tok) obj).az;
                aihf aihfVar5 = (aihf) this.a;
                aihfVar5.copyOnWrite();
                jrh jrhVar = (jrh) aihfVar5.instance;
                jrh jrhVar2 = jrh.a;
                jrhVar.b |= SemanticState.Multiline;
                jrhVar.r = i;
                break;
            case 9:
                agrf agrfVar = zzv.a;
                aabp.c((Intent) this.a, (xgt) obj);
                break;
            case 10:
                ((aqpf) this.a).aq((aqpe) obj);
                break;
            case 11:
                ((agjz) this.a).h((arer) obj);
                break;
            case 12:
                ajhl ajhlVar = (ajhl) obj;
                aihf aihfVar6 = (aihf) this.a;
                aihfVar6.copyOnWrite();
                asga asgaVar = (asga) aihfVar6.instance;
                asga asgaVar2 = asga.a;
                ajhlVar.getClass();
                asgaVar.d = ajhlVar;
                asgaVar.b |= 1;
                break;
            case 13:
                ((abvk) this.a).K((acca) obj);
                break;
            case 14:
                abdu abduVar = (abdu) this.a;
                abduVar.a.h((xhy) obj, abduVar.b.d(), null);
                break;
            case 15:
                this.a.kk((abeu) obj);
                break;
            case 16:
                acbk acbkVar = (acbk) obj;
                double d = acbkVar.c;
                acdf acdfVar = ((abhe) this.a).l;
                acdfVar.i(d);
                acdfVar.h(acbkVar.d);
                acdfVar.j(acbkVar.a);
                acdfVar.k(acbkVar.b);
                break;
            case 17:
                ((abge) this.a).p(obj);
                break;
            case 18:
                ((HashMap) this.a).remove((String) obj);
                break;
            case 19:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((wuq) this.a).O = Optional.of(bool);
                break;
            default:
                Object obj2 = this.a;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                abty abtyVar = (abty) obj2;
                ListenableFuture listenableFuture2 = abtyVar.e;
                if (listenableFuture2 != null) {
                    if (listenableFuture2 != listenableFuture) {
                        listenableFuture2.cancel(false);
                    }
                }
                abtyVar.e = listenableFuture;
                taf.i(listenableFuture, abtyVar.c.k ? abtyVar.d : abtyVar.b, new wuy(obj2, 14), new yqj(obj2, 11), new abmn(2));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
