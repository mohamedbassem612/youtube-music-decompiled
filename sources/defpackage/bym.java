package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bym implements agex {
    private final /* synthetic */ int $cid;

    public /* synthetic */ bym(int i) {
        this.$cid = i;
    }

    @Override // defpackage.agex
    public final boolean a(Object obj) {
        switch (this.$cid) {
            case 0:
                if (((String) obj) == null) {
                    return false;
                }
                break;
            case 1:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                break;
            case 2:
                int i = cvr.c;
                return ((cyd) obj).b.equals("iTunSMPB");
            case 3:
                cyj cyjVar = (cyj) obj;
                int i2 = cvr.c;
                if (!cyjVar.a.equals("com.apple.iTunes") || !cyjVar.b.equals("iTunSMPB")) {
                    return false;
                }
                break;
            case 4:
                return ((cym) obj).f.equals("TLEN");
            case 5:
                if (((bsw) obj) instanceof cxk) {
                    return false;
                }
                break;
            case 6:
                return ((bwu) obj).a.equals("auxiliary.tracks.interleaved");
            case 7:
                return ((bwu) obj).a.equals("auxiliary.tracks.map");
            case 8:
                if (!(obj instanceof anwt)) {
                    return false;
                }
                alay alayVar = ((anwt) obj).d;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                if (TextUtils.isEmpty(ackj.k(null, alayVar, null, false))) {
                    return false;
                }
                break;
            case 9:
                String str = (String) obj;
                if (str == null || str.isEmpty()) {
                    return false;
                }
                break;
            case 10:
                ajwo ajwoVar = (ajwo) obj;
                if (ajwoVar == null) {
                    return false;
                }
                aihl aihlVarCheckIsLite = aihn.checkIsLite(alhe.b);
                ajwoVar.c(aihlVarCheckIsLite);
                if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                    return false;
                }
                break;
            case 11:
                break;
            case 12:
                int iBc = a.bc(((aofh) obj).c);
                if (iBc == 0 || iBc != 4) {
                    return false;
                }
                break;
            case 13:
                hyz hyzVar = (hyz) obj;
                if (hyzVar.n() == null || gzj.aa(hyzVar.n())) {
                    return false;
                }
                break;
            case 14:
                break;
            case 15:
                int iAU = a.aU(((oin) obj).m);
                if (iAU == 0 || iAU != 2) {
                    return false;
                }
                break;
            case 16:
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2) || !str2.startsWith("VISITED_EFFECT_ID_")) {
                    return false;
                }
                break;
            case 17:
                return yno.fD((uzj) obj, aldi.XENO_EFFECT_RENDERING_PRIORITY_EXCLUSIVE);
            case 18:
                String str3 = (String) obj;
                if (TextUtils.isEmpty(str3) || !str3.endsWith("_ReelsCreatorWatchLaterStickerLastUsedTime")) {
                    return false;
                }
                break;
            case 19:
                break;
            default:
                return taq.A((toe) obj);
        }
        return true;
    }
}
