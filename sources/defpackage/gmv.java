package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gmv implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ gmv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v63, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v64, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, mbc] */
    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                agrf agrfVar = gmy.a;
                gmk gmkVar = new gmk((anqm) obj, 2);
                Object obj2 = this.a;
                ((woo) obj2).K(gmkVar);
                return obj2;
            case 1:
                String string = (String) obj;
                boolean zIsEmpty = TextUtils.isEmpty(string);
                Object obj3 = this.a;
                if (!zIsEmpty) {
                    return string;
                }
                try {
                    if (((gls) obj3).j == null) {
                        return string;
                    }
                    Cursor cursorQuery = ((gls) obj3).b.getContentResolver().query(((gls) obj3).j, new String[]{"_display_name"}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                            }
                        } catch (Throwable th) {
                            try {
                                cursorQuery.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (cursorQuery == null) {
                        return string;
                    }
                    cursorQuery.close();
                    return string;
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) gls.a.b().i(agso.a, "AudioPreview")).j(e)).k("com/google/android/apps/youtube/music/audiopreview/AudioPreviewPlayerActivityPeer", "initTitleView", (char) 528, "AudioPreviewPlayerActivityPeer.java")).t("Failed to get title metadata using ContentResolver");
                    return string;
                }
            case 2:
                wfy wfyVar = (wfy) obj;
                wfyVar.getClass();
                gnm gnmVarA = gnn.a();
                gnmVarA.d(true);
                gnmVarA.b(true);
                gnmVarA.c(this.a.f().toEpochMilli());
                return new gnq(wfyVar, gnmVarA.a());
            case 3:
                return ((gpu) aguu.aw((Context) ((aczl) this.a).d, gpu.class, (affd) obj)).g();
            case 4:
                return ((gva) aguu.aw(((gvb) this.a).a, gva.class, (affd) obj)).g();
            case 5:
                return Integer.valueOf(((AtomicInteger) this.a).get());
            case 6:
                aihf builder = ((aimo) obj).toBuilder();
                builder.copyOnWrite();
                aimo aimoVar = (aimo) builder.instance;
                Object obj4 = this.a;
                obj4.getClass();
                aiie aiieVar = aimoVar.b;
                if (!aiieVar.c()) {
                    aimoVar.b = aihn.mutableCopy(aiieVar);
                }
                aimoVar.b.add(obj4);
                return (aimo) builder.build();
            case 7:
                return Boolean.valueOf(((List) obj).contains(this.a));
            case 8:
                return ((hbb) aguu.aw(((hbc) this.a).b, hbb.class, (affd) obj)).M();
            case 9:
                ((agrc) ((agrc) ((agrc) hct.a.c()).j((Exception) obj)).k("com/google/android/apps/youtube/music/feedback/HelpClient", "wrapWithTimeoutAndCatchDataFuture", 148, "HelpClient.java")).t("Exception with future.");
                return this.a;
            case 10:
                byte[] bArr = (byte[]) obj;
                ArrayList arrayList = new ArrayList();
                if (bArr.length > 0) {
                    zj zjVar = new zj();
                    zjVar.a = "ytmusic_log";
                    zjVar.d();
                    zjVar.b = bArr;
                    arrayList.add(zjVar.c());
                }
                agqr it = ((agpr) ((hef) this.a).b).iterator();
                while (it.hasNext()) {
                    aeqo aeqoVarAD = ((xsc) it.next()).aD();
                    if (aeqoVarAD != null) {
                        arrayList.add(aeqoVarAD);
                    }
                }
                return arrayList;
            case 11:
                return ((hcv) aguu.aw(((hcw) this.a).a, hcv.class, (affd) obj)).f();
            case 12:
                return ((hdo) aguu.aw(((hdp) this.a).b, hdo.class, (affd) obj)).L();
            case 13:
                if (!((Boolean) obj).booleanValue()) {
                    return null;
                }
                hfa hfaVar = (hfa) this.a;
                amlh amlhVar = hfaVar.d.c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                if (!fhz.w(amlhVar)) {
                    return null;
                }
                hfaVar.c.b("LM");
                return null;
            case 14:
                return ((hgj) aguu.aw(((hgk) this.a).b, hgj.class, (affd) obj)).e();
            case 15:
                return ((hgp) aguu.aw(((hgs) this.a).b, hgp.class, (affd) obj)).e();
            case 16:
                this.a.invoke(obj);
                return null;
            case 17:
                this.a.invoke(obj);
                return null;
            case 18:
                return ((hja) this.a).a;
            case 19:
                return ((hkj) aguu.aw(((hkl) this.a).l, hkj.class, (affd) obj)).g();
            default:
                agke agkeVar = (agke) obj;
                agjz agjzVar = new agjz(4);
                int i = 0;
                while (true) {
                    ?? r2 = this.a;
                    if (i >= r2.size()) {
                        return agjzVar.g();
                    }
                    ahgr ahgrVar = new ahgr();
                    ahgrVar.l((aajy) agkeVar.get(i));
                    ahgrVar.m(hne.e(((anyx) r2.get(i)).getVideoId()));
                    agjzVar.h(ahgrVar.k());
                    i++;
                }
                break;
        }
    }
}
