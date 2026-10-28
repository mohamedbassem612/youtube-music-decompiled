package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xzn implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ xzn(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        abxp abxpVarA;
        Iterable iterable;
        aiie aiieVar;
        switch (this.$cid) {
            case 0:
                xpg xpgVar = (xpg) obj;
                awqg awqgVar = xzs.b;
                xpgVar.getClass();
                aihf aihfVarCreateBuilder = alwu.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                akll akllVar = xpgVar.a;
                akllVar.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                alwu alwuVar = (alwu) aihfVarCreateBuilder.instance;
                alwuVar.e = akllVar;
                alwuVar.b |= 8;
                aihn aihnVarBuild = aihfVarCreateBuilder.build();
                aihnVarBuild.getClass();
                return (alwu) aihnVarBuild;
            case 1:
                aigj aigjVar = (aigj) obj;
                aigjVar.getClass();
                try {
                    return (aiqj) aihn.parseFrom(aiqj.a, aigjVar, ExtensionRegistryLite.getGeneratedRegistry());
                } catch (aiik e) {
                    twu.c(6, "Failed to parse account dynamic config", e);
                }
                break;
            case 2:
                abxd abxdVar = (abxd) obj;
                abxdVar.getClass();
                int i = awrn.a;
                abyc abycVar = (abyc) abxdVar.a.c.get(new awqv(abxi.class));
                abxp abxpVarA2 = abycVar != null ? abycVar.a() : null;
                if (true != (abxpVarA2 instanceof abxi)) {
                    abxpVarA2 = null;
                }
                abxi abxiVar = (abxi) abxpVarA2;
                if (abxiVar != null) {
                    return abxiVar;
                }
                abyc abycVar2 = (abyc) abyd.b.get(new awqv(abxi.class));
                abxpVarA = abycVar2 != null ? abycVar2.a() : null;
                if (abxpVarA != null) {
                    return (abxi) abxpVarA;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.AudioSettingModel");
            case 3:
                twu.d("AudioSettingControl", 6, "Error in activeConfigurationChangedFlowable", (Throwable) obj);
                return awmy.a;
            case 4:
                abxe abxeVar = (abxe) obj;
                String str = abwx.a;
                abxeVar.getClass();
                return avlh.B(abxeVar.b);
            case 5:
                twu.d(abwx.a, 6, "Error in activeSettingChangedFlowable", (Throwable) obj);
                return awmy.a;
            case 6:
                abxd abxdVar2 = (abxd) obj;
                abxdVar2.getClass();
                int i2 = awrn.a;
                abyc abycVar3 = (abyc) abxdVar2.a.c.get(new awqv(abxk.class));
                abxp abxpVarA3 = abycVar3 != null ? abycVar3.a() : null;
                if (true != (abxpVarA3 instanceof abxk)) {
                    abxpVarA3 = null;
                }
                abxk abxkVar = (abxk) abxpVarA3;
                if (abxkVar != null) {
                    return abxkVar;
                }
                abyc abycVar4 = (abyc) abyd.b.get(new awqv(abxk.class));
                abxpVarA = abycVar4 != null ? abycVar4.a() : null;
                if (abxpVarA != null) {
                    return (abxk) abxpVarA;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.SkipSilenceSettingModel");
            case 7:
                twu.c(6, "SkipSilenceSettingControl:Error in activeConfigurationChangedFlowable", (Throwable) obj);
                return awmy.a;
            case 8:
                abxd abxdVar3 = (abxd) obj;
                abxdVar3.getClass();
                int i3 = awrn.a;
                abyc abycVar5 = (abyc) abxdVar3.a.c.get(new awqv(abxo.class));
                abxp abxpVarA4 = abycVar5 != null ? abycVar5.a() : null;
                if (true != (abxpVarA4 instanceof abxo)) {
                    abxpVarA4 = null;
                }
                abxo abxoVar = (abxo) abxpVarA4;
                if (abxoVar != null) {
                    return abxoVar;
                }
                abyc abycVar6 = (abyc) abyd.b.get(new awqv(abxo.class));
                abxpVarA = abycVar6 != null ? abycVar6.a() : null;
                if (abxpVarA != null) {
                    return (abxo) abxpVarA;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.youtube.player.settings.control.models.PlayerSettingModel.VideoQualitySettingModel");
            case 9:
                twu.c(6, "VideoQualitySettingControl:Error in activeConfigurationChangedFlowable", (Throwable) obj);
                return awmy.a;
            case 10:
                twu.c(6, "PlayerSettingEventBridge:Error in handleDynamicSettingChangedEvent", (Throwable) obj);
                return awmy.a;
            case 11:
                twu.c(6, "PlayerSettingEventBridge:Error in handleActiveSettingChangedEvent", (Throwable) obj);
                return awmy.a;
            case 12:
                aayt aaytVar = (aayt) obj;
                aaytVar.getClass();
                return Boolean.valueOf(aaytVar.a == abnv.b && aaytVar.a() != null);
            case 13:
                aayt aaytVar2 = (aayt) obj;
                aaytVar2.getClass();
                wjf wjfVarA = aaytVar2.a();
                wjfVarA.getClass();
                alvt alvtVarU = wjfVarA.u();
                if (alvtVarU != null && (aiieVar = alvtVarU.H) != null && !aiieVar.isEmpty()) {
                    aiie aiieVar2 = alvtVarU.H;
                    aiieVar2.getClass();
                    return aiieVar2;
                }
                aihf aihfVarCreateBuilder2 = akjg.a.createBuilder();
                akjh akjhVar = akjh.PLAYER_CUE_RANGE_SET_IDENTIFIER_EMBARGO;
                aihfVarCreateBuilder2.copyOnWrite();
                akjg akjgVar = (akjg) aihfVarCreateBuilder2.instance;
                akjgVar.c = akjhVar.t;
                akjgVar.b |= 1;
                if (alvtVarU == null || (iterable = alvtVarU.G) == null) {
                    iterable = agpi.a;
                }
                aihfVarCreateBuilder2.aS(iterable);
                return agke.q(aihfVarCreateBuilder2.build());
            case 14:
                obj.getClass();
                return Integer.valueOf(awrw.a.c() + 65536);
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 16:
                awos awosVar = (awos) obj;
                if (awosVar instanceof awuq) {
                    return (awuq) awosVar;
                }
                break;
            case 17:
                awos awosVar2 = (awos) obj;
                if (awosVar2 instanceof awvv) {
                    return (awvv) awosVar2;
                }
                break;
            default:
                return obj;
        }
        return null;
    }
}
