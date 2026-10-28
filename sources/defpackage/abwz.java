package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abwz implements avni {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ abwz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0268  */
    /* JADX WARN: Type inference failed for: r11v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [awqg, java.lang.Object] */
    @Override // defpackage.avni
    public final void a(Object obj) {
        Uri uri;
        int i;
        String str = null;
        switch (this.$cid) {
            case 0:
                this.a.invoke(obj);
                break;
            case 1:
                String str2 = abwx.a;
                this.a.invoke(obj);
                break;
            case 2:
                this.a.invoke(obj);
                break;
            case 3:
                this.a.invoke(obj);
                break;
            case 4:
                this.a.invoke(obj);
                break;
            case 5:
                ((aazq) obj).b.ad().P().al(new aawl(new absp(this.a, 16), "DRCC", 0), new abxq(0));
                break;
            case 6:
                Optional optional = (Optional) obj;
                abxr abxrVar = (abxr) this.a;
                abxrVar.a = optional;
                abxrVar.b.s(((Boolean) optional.orElse(Boolean.TRUE)).booleanValue());
                break;
            case 7:
                this.a.invoke(obj);
                break;
            case 8:
                this.a.invoke(obj);
                break;
            case 9:
                this.a.invoke(obj);
                break;
            case 10:
                this.a.invoke(obj);
                break;
            case 11:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = ((ci) this.a).a;
                if (obj2 != null) {
                    ((ytv) obj2).u(zBooleanValue);
                }
                break;
            case 12:
                aazj aazjVar = (aazj) obj;
                abob abobVar = aazjVar.a;
                int iOrdinal = abobVar.ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    abzu abzuVar = (abzu) obj3;
                    abzuVar.b = null;
                    abzuVar.e++;
                    if (abzuVar.a != null) {
                        abzuVar.a.a();
                        abzuVar.a = null;
                    }
                } else if (iOrdinal == 5 || iOrdinal == 8) {
                    wjf wjfVar = abobVar.h() ? aazjVar.c : aazjVar.b;
                    if (wjfVar != null) {
                        wja wjaVarG = wjfVar.g();
                        if (wjaVarG != null) {
                            StreamingDataOuterClass$StreamingData streamingDataOuterClass$StreamingData = wjaVarG.d;
                            if (streamingDataOuterClass$StreamingData.j.isEmpty()) {
                                uri = null;
                            } else {
                                uri = Uri.parse(streamingDataOuterClass$StreamingData.j);
                            }
                        } else {
                            uri = null;
                        }
                        ajvo ajvoVar = wjfVar.f().d.E;
                        if (ajvoVar == null) {
                            ajvoVar = ajvo.a;
                        }
                        wjf wjfVar2 = aazjVar.c;
                        int i2 = ajvoVar.b;
                        if (wjfVar2 != null) {
                            str = aazjVar.h;
                        } else if (aazjVar.b != null) {
                            str = aazjVar.g;
                        }
                        String str3 = str;
                        String strG = wjfVar.G();
                        abzu abzuVar2 = (abzu) obj3;
                        if (!strG.equals(abzuVar2.b)) {
                            abzuVar2.b = strG;
                            if (abzuVar2.d) {
                                abzuVar2.c.execute(afwl.i(new aecg(abzuVar2, uri, i2, str3, abzuVar2.e, 1)));
                            } else {
                                abzt abztVarT = abzuVar2.f.T(uri, i2, str3);
                                abzuVar2.a = abztVarT;
                                abztVarT.b();
                            }
                        }
                    }
                }
                break;
            case 13:
                aazl aazlVar = (aazl) obj;
                String str4 = aazlVar.b;
                Object obj4 = this.a;
                zgj zgjVar = str4 != null ? (zgj) ((abzz) obj4).d.get(str4) : null;
                if (zgjVar != null && (i = aazlVar.c) != 0 && !aazlVar.d && ((abzz) obj4).c.bE()) {
                    String strB = aazlVar.b().equals("-") ? "" : aazlVar.b();
                    acca accaVar = aazlVar.a;
                    str = accaVar != null ? accaVar.f : null;
                    int i3 = typ.a;
                    String strA = aazlVar.a().equals("-") ? "" : aazlVar.a();
                    int i4 = accaVar != null ? accaVar.e : 0;
                    String strC = typ.c(str);
                    if (!strB.equals(zgjVar.F) || !strC.equals(zgjVar.G)) {
                        zgjVar.F = strB;
                        zgjVar.G = strC;
                        String strConcat = zgjVar.c() + ':' + strB + ':';
                        if (i4 != 0) {
                            strConcat = strConcat.concat(String.valueOf(i4) + ';' + strC);
                        }
                        zgjVar.e.a("cfs", strConcat + ':' + strA + ':' + aawr.s(i));
                    }
                    break;
                }
                break;
            case 14:
                aawt aawtVar = (aawt) obj;
                String str5 = aawtVar.b;
                zgj zgjVar2 = (zgj) ((abzz) this.a).d.get(str5);
                if (zgjVar2 == null) {
                    ((agrc) ((agrc) abzz.a.c()).k("com/google/android/libraries/youtube/player/stats/playbacklistener/QoeStatsPlaybackListener", "handleLiveCaptionParsingError", 615, "QoeStatsPlaybackListener.java")).B("%s:handleLiveCaptionParsingError: no qoe client was registered for CPN: %s, cannot log event", "QoeStatsPlaybackListener", str5);
                } else {
                    long j = aawtVar.a;
                    String simpleName = aawt.class.getSimpleName();
                    Long lValueOf = Long.valueOf(j);
                    zhv zhvVar = new zhv("captions.unparseable");
                    zhvVar.f("c", simpleName);
                    zhvVar.f("seq", lValueOf.toString());
                    zhvVar.e = false;
                    zgjVar2.w(zhvVar.a());
                }
                break;
            case 15:
                aaxh aaxhVar = (aaxh) obj;
                Iterator it = ((abzz) this.a).d.values().iterator();
                while (it.hasNext()) {
                    ((zgj) it.next()).h(aaxhVar.c);
                }
                break;
            case 16:
                boolean z = ((aayy) obj).a;
                for (zgj zgjVar3 : ((abzz) this.a).d.values()) {
                    if (z != zgjVar3.D) {
                        zgjVar3.D = z;
                        Locale locale = Locale.US;
                        String strC2 = zgjVar3.c();
                        int i5 = zic.a;
                        zgjVar3.e.a("sks", String.format(locale, "%s:%s", strC2, true != z ? "0" : "1"));
                    }
                }
                break;
            case 17:
                aaxo aaxoVar = (aaxo) obj;
                abzz abzzVar = (abzz) this.a;
                abzzVar.e = aaxoVar;
                Iterator it2 = abzzVar.d.values().iterator();
                while (it2.hasNext()) {
                    abzz.y((zgj) it2.next(), aaxoVar);
                }
                break;
            case 18:
                aooc aoocVar = (aooc) obj;
                Iterator it3 = ((abzz) this.a).d.values().iterator();
                while (it3.hasNext()) {
                    ((zgj) it3.next()).I(aoocVar.n);
                }
                break;
            case 19:
                int iIntValue = ((Integer) obj).intValue();
                Iterator it4 = ((abzz) this.a).d.values().iterator();
                while (it4.hasNext()) {
                    ((zgj) it4.next()).g(iIntValue);
                }
                break;
            default:
                aaza aazaVar = (aaza) obj;
                String str6 = aazaVar.d;
                Map map = ((abzz) this.a).d;
                if (map.containsKey(str6)) {
                    ((zgj) map.get(str6)).D(aazaVar.e, aazaVar.g, aazaVar.h, aazaVar.i, aazaVar.k, aazaVar.a, aazaVar.a(), aazaVar.b, aazaVar.c);
                }
                break;
        }
    }
}
