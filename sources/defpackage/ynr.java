package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ynr implements sya {
    @Override // defpackage.sya
    public final Object a(Object obj, Object obj2) {
        aihf aihfVar = (aihf) obj2;
        agkz agkzVarEntrySet = ((agkj) ((dov) obj).a).entrySet();
        aihf aihfVarCreateBuilder = atpj.a.createBuilder();
        agqr it = ((agpk) agkzVarEntrySet).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if ("exo_cache_size_bytes_used".equals(str)) {
                    long jLongValue = ((Long) value).longValue();
                    aihfVar.copyOnWrite();
                    atpl atplVar = (atpl) aihfVar.instance;
                    atpl atplVar2 = atpl.a;
                    atplVar.b |= 1;
                    atplVar.c = jLongValue;
                } else if (str.endsWith("last_playback_start_timestamp")) {
                    aihfVar.cL(str, ((Long) value).longValue());
                } else if ("media_persisted_bandwidth_samples".equals(str)) {
                    String str2 = (String) value;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            zig zigVar = (zig) aihn.parseFrom(zig.a, Base64.decode(str2, 10), ExtensionRegistryLite.getGeneratedRegistry());
                            aihfVar.copyOnWrite();
                            atpl atplVar3 = (atpl) aihfVar.instance;
                            atpl atplVar4 = atpl.a;
                            zigVar.getClass();
                            atplVar3.e = zigVar;
                            atplVar3.b |= 2;
                        } catch (aiik e) {
                            zvp.b(zvn.a, zvm.f, "Invalid persisted bandwidth samples. Ignored.", e);
                        }
                    }
                } else if (str.endsWith("last_manual_video_quality_selection_max")) {
                    int iIntValue = ((Integer) value).intValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpj atpjVar = (atpj) aihfVarCreateBuilder.instance;
                    atpjVar.b |= 1;
                    atpjVar.c = iIntValue;
                } else if (str.endsWith("last_manual_video_quality_selection_direction")) {
                    int iIntValue2 = ((Integer) value).intValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpj atpjVar2 = (atpj) aihfVarCreateBuilder.instance;
                    atpjVar2.b |= 2;
                    atpjVar2.d = iIntValue2;
                } else if (str.endsWith("last_manual_video_quality_selection_timestamp")) {
                    long jLongValue2 = ((Long) value).longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    atpj atpjVar3 = (atpj) aihfVarCreateBuilder.instance;
                    atpjVar3.b |= 4;
                    atpjVar3.e = jLongValue2;
                } else if (str.startsWith("av1_supported") || str.startsWith("av1_profile_main_10_supported") || str.startsWith("av1_profile_main_10_hdr_10_plus_supported") || str.startsWith("h264_main_profile_supported") || str.startsWith("vp9_profile_2_hdr_10_plus_supported") || str.startsWith("vp9_profile_2_supported") || str.startsWith("vp9_secure_profile_2_supported") || str.startsWith("vp9_secure_supported") || str.startsWith("vp9_supported") || str.startsWith("opus_supported")) {
                    aihfVar.cM(str, ((Boolean) value).booleanValue());
                } else if (str.equals("limit_mobile_data_usage")) {
                    arfb arfbVar = ((Boolean) value).booleanValue() ? arfb.VIDEO_QUALITY_SETTING_DATA_SAVER : arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                    aihfVar.copyOnWrite();
                    atpl atplVar5 = (atpl) aihfVar.instance;
                    atpl atplVar6 = atpl.a;
                    atplVar5.i = arfbVar.e;
                    atplVar5.b |= 16;
                } else if (str.equals("dcip3_supported")) {
                    boolean zBooleanValue = ((Boolean) value).booleanValue();
                    aihfVar.copyOnWrite();
                    atpl atplVar7 = (atpl) aihfVar.instance;
                    atpl atplVar8 = atpl.a;
                    atplVar7.b |= SemanticState.ReadOnly;
                    atplVar7.n = zBooleanValue;
                }
            }
        }
        atpj atpjVar4 = (atpj) aihfVarCreateBuilder.instance;
        if ((atpjVar4.b & 1) != 0) {
            if (wgs.K(atpjVar4.c)) {
                aihfVar.copyOnWrite();
                atpl atplVar9 = (atpl) aihfVar.instance;
                atpj atpjVar5 = (atpj) aihfVarCreateBuilder.build();
                atpl atplVar10 = atpl.a;
                atpjVar5.getClass();
                atplVar9.o = atpjVar5;
                atplVar9.b |= SemanticState.Modal;
            } else {
                aihfVar.copyOnWrite();
                atpl atplVar11 = (atpl) aihfVar.instance;
                atpj atpjVar6 = (atpj) aihfVarCreateBuilder.build();
                atpl atplVar12 = atpl.a;
                atpjVar6.getClass();
                atplVar11.p = atpjVar6;
                atplVar11.b |= SemanticState.Obscured;
            }
        }
        return aihfVar;
    }
}
