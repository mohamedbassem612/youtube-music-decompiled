package defpackage;

import android.media.AudioDeviceInfo;
import android.net.Uri;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class snm implements Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ snm(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo840andThen(Function function) {
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
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        aran aranVar;
        switch (this.$cid) {
            case 0:
                apji apjiVar = ((ambn) obj).e;
                return apjiVar == null ? apji.a : apjiVar;
            case 1:
                apji apjiVar2 = ((ambn) obj).c;
                return apjiVar2 == null ? apji.a : apjiVar2;
            case 2:
                arcg arcgVar = ((aisv) obj).c;
                return arcgVar == null ? arcg.a : arcgVar;
            case 3:
                aihf aihfVarCreateBuilder = akaf.a.createBuilder();
                JSONObject jSONObject = (JSONObject) ((eol) obj).b;
                String strOptString = jSONObject.optString("purchaseId");
                aihfVarCreateBuilder.copyOnWrite();
                akaf akafVar = (akaf) aihfVarCreateBuilder.instance;
                strOptString.getClass();
                akafVar.b |= 1;
                akafVar.c = strOptString;
                int i = jSONObject.optInt("purchaseState", 1) != 4 ? 2 : 3;
                aihfVarCreateBuilder.copyOnWrite();
                akaf akafVar2 = (akaf) aihfVarCreateBuilder.instance;
                akafVar2.d = i - 1;
                akafVar2.b |= 2;
                return (akaf) aihfVarCreateBuilder.build();
            case 4:
                return ((tld) obj).a;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return new tnd((String) entry.getKey(), (String) entry.getValue());
            case 6:
                return Boolean.valueOf(tzk.u(((Long) obj).longValue(), 130) == 2);
            case 7:
                return Boolean.valueOf(tzk.u(((Long) obj).longValue(), 130) == 2);
            case 8:
                return Integer.valueOf(((anck) obj).ordinal());
            case 9:
                return Collection.EL.stream((agke) obj);
            case 10:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                int i2 = ugh.b;
                aihf aihfVarCreateBuilder2 = arad.a.createBuilder();
                if (audioDeviceInfo.isSink()) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    arad aradVar = (arad) aihfVarCreateBuilder2.instance;
                    aradVar.c = 2;
                    aradVar.b |= 1;
                } else if (audioDeviceInfo.isSource()) {
                    aihfVarCreateBuilder2.copyOnWrite();
                    arad aradVar2 = (arad) aihfVarCreateBuilder2.instance;
                    aradVar2.c = 1;
                    aradVar2.b |= 1;
                } else {
                    aihfVarCreateBuilder2.copyOnWrite();
                    arad aradVar3 = (arad) aihfVarCreateBuilder2.instance;
                    aradVar3.c = 0;
                    aradVar3.b |= 1;
                }
                int type = audioDeviceInfo.getType();
                if (type == 1 || type == 2) {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN;
                } else if (type == 3 || type == 4) {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_WIRED_HEADSET;
                } else if (type == 7 || type == 8) {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLUETOOTH;
                } else if (type == 15) {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN;
                } else if (type == 22) {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_WIRED_HEADSET;
                } else if (type != 24) {
                    aranVar = (type == 30 || type == 26 || type == 27) ? aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BLE : aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_UNKNOWN;
                } else {
                    aranVar = aran.UPLOAD_SHORTS_AUDIO_DEVICE_TYPE_BUILT_IN;
                }
                aihfVarCreateBuilder2.copyOnWrite();
                arad aradVar4 = (arad) aihfVarCreateBuilder2.instance;
                aradVar4.d = aranVar.h;
                aradVar4.b |= 2;
                return (arad) aihfVarCreateBuilder2.build();
            case 11:
                akha akhaVarA = akha.a(((akgz) obj).b);
                return akhaVarA == null ? akha.CREATION_FEATURE_UNSPECIFIED : akhaVarA;
            case 12:
                throw null;
            case 13:
                agrf agrfVar = uld.a;
                return (qvs) ((qvu) obj).clone();
            case 14:
                return ((qvs) obj).m;
            case 15:
                return Uri.parse(((uqa) obj).b);
            case 16:
                return (uqa) obj;
            case 17:
                return uqm.a(obj);
            case 18:
                return uqm.a(obj);
            case 19:
                usr usrVar = (usr) obj;
                return new ury(usrVar.a, usrVar.b);
            default:
                return Long.valueOf(((augy) obj).e);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
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
        return Function$CC.$default$compose(this, function);
    }
}
