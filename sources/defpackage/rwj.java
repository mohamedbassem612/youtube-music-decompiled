package defpackage;

import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreEditTextPreference;
import com.google.android.libraries.youtube.common.ui.preferences.ProtoDataStoreSwitchPreference;
import com.google.android.libraries.youtube.composition.api.EmbedResult;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rwj implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rwj(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v35, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v37, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v43, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [awqg, java.lang.Object] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                smr smrVar = (smr) obj;
                skl sklVar = (skl) smrVar.d(sip.class);
                wjf wjfVar = (wjf) smrVar.d(sid.class);
                ahno.P(!wjfVar.R(), "Received fulfillment request for offline playback");
                wgk wgkVar = (wgk) smrVar.d(shl.class);
                ahno.P(wgkVar != null, "Player bytes slot has AdBreakResponseModelGetter but the ad break response is null.");
                String str = smrVar.a;
                Optional optionalOfNullable = Optional.ofNullable(wgkVar.d());
                List listG = wgkVar.g();
                rwl rwlVar = (rwl) this.a;
                return rwlVar.b.c(str, sklVar, optionalOfNullable, agke.n(rwlVar.a.b(sklVar, listG, wjfVar)));
            case 1:
                smr smrVar2 = (smr) obj;
                aopn aopnVar = (aopn) smrVar2.d(sjf.class);
                wjf wjfVar2 = (wjf) smrVar2.d(sid.class);
                if (wjfVar2.R()) {
                    throw new IllegalStateException("Received fulfillment request for offline playback");
                }
                Optional optionalOf = smrVar2.e(shl.class) ? Optional.of((wgk) smrVar2.d(shl.class)) : Optional.empty();
                try {
                    aiuc aiucVar = aopnVar.c;
                    if (aiucVar == null) {
                        aiucVar = aiuc.a;
                    }
                    aixg aixgVarA = aixg.a(aiucVar.d);
                    if (aixgVarA == null) {
                        aixgVarA = aixg.LAYOUT_TYPE_UNSPECIFIED;
                    }
                    int iOrdinal = aixgVarA.ordinal();
                    Object obj2 = this.a;
                    if (iOrdinal == 1) {
                        return ((rwi) obj2).a.h(aopnVar, wjfVar2, optionalOf);
                    }
                    if (iOrdinal == 2) {
                        return ((rwi) obj2).a.g(aopnVar, wjfVar2, optionalOf);
                    }
                    if (iOrdinal == 15) {
                        return ((rwi) obj2).a.f(aopnVar, wjfVar2, smrVar2.a, optionalOf, false);
                    }
                    throw new IllegalStateException("Unable to fulfill a slot due to the unsupported layout type.");
                } catch (sas e) {
                    throw new IllegalStateException("Unable to create a layout to fulfill a playerbytes server slot.", e);
                }
            case 2:
                ((sym) this.a).a.run();
                return null;
            case 3:
                ((syn) this.a).a.run();
                return null;
            case 4:
                Exception exc = (Exception) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((tls) this.a).d(exc);
                return exc;
            case 5:
                tnx tnxVar = (tnx) obj;
                boolean zH = tnxVar.h();
                Object obj3 = this.a;
                if (!zH) {
                    tnxVar.a();
                    ((tmb) obj3).b(tnxVar.a().a);
                    return null;
                }
                if (tnxVar.c().a == null) {
                    ((tmb) obj3).b(new toe("unexpected empty response"));
                    return null;
                }
                ((tmb) obj3).d.c(tnxVar.c());
                return null;
            case 6:
                Exception exc2 = (Exception) obj;
                if (exc2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((tmb) this.a).b(exc2);
                return exc2;
            case 7:
                tpk tpkVar = (tpk) this.a;
                return tpkVar.b.a(tpkVar.a.io(), (MessageLite) obj);
            case 8:
                String str2 = (String) obj;
                ((ProtoDataStoreEditTextPreference) this.a).k(str2);
                return str2;
            case 9:
                return this.a;
            case 10:
                ((ProtoDataStoreSwitchPreference) this.a).ai((Boolean) obj);
                return null;
            case 11:
                return this.a.apply((MessageLite) obj);
            case 12:
                EmbedResult embedResult = (EmbedResult) obj;
                embedResult.getClass();
                if (embedResult != EmbedResult.EMBEDDED) {
                    ((agrc) uhk.a.c().k("com/google/android/libraries/youtube/creation/common/provenance/TranscodeProvenanceHelper", "embedComposition$<anonymous>", 246, "TranscodeProvenanceHelper.kt")).w("C2PA manifest embedding completed with result: %s for transcode segment", embedResult);
                }
                return this.a;
            case 13:
                return this.a.invoke(obj);
            case 14:
                return this.a.invoke(obj);
            case 15:
                return this.a.invoke(obj);
            case 16:
                return this.a.invoke(obj);
            case 17:
                return uvn.a((auhs) this.a, (agkz) obj);
            case 18:
                long j = vcp.a;
                return this.a.invoke(obj);
            case 19:
                long j2 = vcp.a;
                return this.a.invoke(obj);
            default:
                long j3 = vcp.a;
                return this.a.invoke(obj);
        }
    }
}
