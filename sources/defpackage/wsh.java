package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wsh implements avno {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ wsh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0169  */
    /* JADX WARN: Type inference failed for: r4v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [awqg, java.lang.Object] */
    @Override // defpackage.avno
    public final boolean a(Object obj) {
        boolean z = false;
        switch (this.$cid) {
            case 0:
                return ((apmh) obj).getPlaylistIds().contains(this.a);
            case 1:
                if (((apmh) obj).getPlaylistIds().contains(this.a)) {
                    return false;
                }
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                boolean z2 = ((yab) this.a).e;
                if (z2) {
                    if (z2) {
                        return false;
                    }
                    if (iIntValue != 3 && iIntValue != 10) {
                        return false;
                    }
                } else if (iIntValue == 2) {
                    iIntValue = 2;
                    if (z2) {
                        return false;
                    }
                    if (iIntValue != 3) {
                        return false;
                    }
                }
            case 3:
                return a.n(this.a, obj);
            case 4:
                return a.n(this.a, obj);
            case 5:
                atpl atplVar = (atpl) obj;
                arfb arfbVarA = arfb.a(atplVar.i);
                if (arfbVarA == null) {
                    arfbVarA = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                }
                zkd zkdVar = (zkd) this.a;
                if (arfbVarA == zkdVar.d()) {
                    arfb arfbVarA2 = arfb.a(atplVar.j);
                    if (arfbVarA2 == null) {
                        arfbVarA2 = arfb.VIDEO_QUALITY_SETTING_UNKNOWN;
                    }
                    if (arfbVarA2 == zkdVar.e()) {
                        ajhj ajhjVarA = ajhj.a(atplVar.k);
                        if (ajhjVarA == null) {
                            ajhjVarA = ajhj.AUDIO_QUALITY_SETTING_UNKNOWN;
                        }
                        if (ajhjVarA == zkdVar.b()) {
                            return false;
                        }
                    }
                }
                break;
            case 6:
                return ((amtc) ((wep) obj).a).getRemoteImageUrl().equals(this.a);
            case 7:
                ?? r4 = this.a;
                Duration duration = abin.a;
                return a.n(r4, obj);
            case 8:
                ?? r5 = this.a;
                Duration duration2 = abin.a;
                return a.n(r5, obj);
            case 9:
                return a.n(this.a, obj);
            case 10:
                return a.n(this.a, obj);
            case 11:
                return a.n(this.a, obj);
            case 12:
                return a.n(this.a, obj);
            case 13:
                return Objects.equals(((aazq) obj).b.n(), this.a);
            case 14:
                return a.n(this.a, obj);
            case 15:
                return a.n(this.a, obj);
            case 16:
                ?? r6 = this.a;
                String str = acjr.a;
                return a.n(r6, obj);
            case 17:
                return ((Class) this.a).isInstance((Throwable) obj);
            case 18:
                return a.n(this.a, obj);
            case 19:
                acmi acmiVar = (acmi) obj;
                acoi acoiVar = (acoi) this.a;
                Optional optionalI = acoiVar.t.i();
                if (true == optionalI.isPresent()) {
                    optionalI = Optional.ofNullable(((acra) optionalI.get()).f);
                }
                acnx acnxVar = new acnx(acoiVar, acmiVar);
                if (true == optionalI.isPresent()) {
                    Object obj2 = optionalI.get();
                    acoi acoiVar2 = acnxVar.a;
                    acmi acmiVar2 = acnxVar.b;
                    if ((acmiVar2.e == null && acmiVar2.f == null) || acmiVar2.b || (acoiVar2.ck.ay() && !acmiVar2.a)) {
                        z = true;
                    }
                    optionalI = Optional.ofNullable(Boolean.valueOf(z));
                }
                return ((Boolean) optionalI.orElse(Boolean.TRUE)).booleanValue();
            default:
                acoi acoiVar3 = (acoi) this.a;
                Boolean bool = (Boolean) acoiVar3.bG.au();
                if (bool != null && !bool.booleanValue()) {
                    Optional optionalI2 = acoiVar3.t.i();
                    if (true == optionalI2.isPresent()) {
                        optionalI2 = Optional.ofNullable(((acra) optionalI2.get()).f);
                    }
                    if (true == optionalI2.isPresent()) {
                        optionalI2 = Optional.ofNullable(Boolean.valueOf(aecm.aw((ajwo) optionalI2.get())));
                    }
                    boolean zBooleanValue = ((Boolean) optionalI2.orElse(Boolean.FALSE)).booleanValue();
                    boolean zI = acoiVar3.z.i();
                    if (!zBooleanValue || !zI) {
                        return false;
                    }
                }
                break;
        }
        return true;
    }
}
