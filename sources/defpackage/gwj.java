package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.Optional;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gwj implements ahcx {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gwj(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v102, types: [agek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v36, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r14v54, types: [java.lang.Object, ont] */
    /* JADX WARN: Type inference failed for: r14v56, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v87, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v94, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v98, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v22, types: [ahcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ahcx
    public final ListenableFuture a() throws InterruptedException, IOException {
        Optional optionalEmpty;
        int iBc;
        ListenableFuture listenableFutureM;
        byte[] bArr = null;
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                ((gwl) obj2).e.execute(new fuc(obj2, obj, 7));
                return aher.a;
            case 1:
                this.a.getClass();
                return ahno.ap(new fxv(2), this.b);
            case 2:
                Object obj3 = this.a;
                wkf wkfVar = (wkf) obj3;
                if (wkfVar.w()) {
                    Object obj4 = this.b;
                    optionalEmpty = Optional.empty();
                    kwq kwqVar = (kwq) obj4;
                    axnp axnpVarK = ((vwi) kwqVar.a).k(wkfVar.Y());
                    if (axnpVarK.d()) {
                        amzv amzvVar = (amzv) axnpVarK.b;
                        Optional optionalOfNullable = Optional.ofNullable(amzvVar);
                        if (axnpVarK.c() == vwn.STALE) {
                            ListenableFuture listenableFutureM2 = ((wqm) kwqVar.b).m((hev) obj3);
                            ahno.av(listenableFutureM2).k(new egz(obj4, listenableFutureM2, obj3, 5, (char[]) null), kwqVar.d);
                        }
                        Object obj5 = kwqVar.c;
                        alop alopVar = amzvVar.c;
                        if (alopVar == null) {
                            alopVar = alop.a;
                        }
                        ((hdr) obj5).b(alopVar);
                        optionalEmpty = optionalOfNullable;
                    }
                } else {
                    optionalEmpty = Optional.empty();
                }
                return ahng.n(optionalEmpty);
            case 3:
                Object obj6 = this.a;
                hia hiaVar = (hia) obj6;
                Object obj7 = hiaVar.s;
                Object obj8 = this.b;
                synchronized (obj7) {
                    if (((hir) ((hia) obj6).d.io()).b(gzl.g)) {
                        ((isr) ((hia) obj6).f.io()).d((String) obj8);
                        return ahng.n(Boolean.TRUE);
                    }
                    ((agrc) ((agrc) hia.b.c()).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentFetcher", "prepareSideloadedTreeAsync", 616, "LocalContentFetcher.java")).t("Start fetching sideloaded media items.");
                    return ahno.ar(((isr) hiaVar.f.io()).b(), new gqa(obj6, obj8, 6), hiaVar.q);
                }
            case 4:
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                for (String str : linkedHashMap.keySet()) {
                    if (linkedHashMap.get(str) != null && !((List) linkedHashMap.get(str)).isEmpty()) {
                        for (Object obj9 : (List) linkedHashMap.get(str)) {
                            Object obj10 = this.a;
                            if (obj9 instanceof anyx) {
                                anyx anyxVar = (anyx) obj9;
                                jgc jgcVar = (jgc) obj10;
                                arrayList.add(jgcVar.d(anyxVar.getVideoId(), anyxVar.getTitle(), anyxVar.getArtistNames(), anyxVar.getThumbnailDetails(), jgcVar.j, str, "PPSV", anyxVar.getEligibleForResumption().booleanValue(), false));
                            } else if (obj9 instanceof anuk) {
                                anuk anukVar = (anuk) obj9;
                                jgc jgcVar2 = (jgc) obj10;
                                arrayList.add(jgcVar2.l(anukVar.getPlaylistId(), anukVar.getTitle(), anukVar.getOwnerDisplayName(), new abuz(anukVar.getThumbnailDetails()), jgcVar2.j, str, false, false));
                            } else if (obj9 instanceof anjx) {
                                anjx anjxVar = (anjx) obj9;
                                jgc jgcVar3 = (jgc) obj10;
                                arrayList.add(jgcVar3.l(anjxVar.getAudioPlaylistId(), anjxVar.getTitle(), anjxVar.getArtistDisplayName(), new abuz(anjxVar.getThumbnailDetails()), jgcVar3.j, str, false, false));
                            }
                        }
                    }
                }
                return ahng.n(arrayList);
            case 5:
                ?? r0 = this.b;
                agrf agrfVar = hur.a;
                return ahno.ap(new huo(this.a, i), r0);
            case 6:
                ?? r1 = this.b;
                agrf agrfVar2 = itq.a;
                return ahno.ap(new huo(this.a, 9), r1);
            case 7:
                Object obj11 = this.a;
                final oih oihVar = (oih) obj11;
                final String str2 = oihVar.a;
                final oka okaVarA = oka.a(str2);
                aihf aihfVarCreateBuilder = oiw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar = (oiw) aihfVarCreateBuilder.instance;
                str2.getClass();
                oiwVar.b |= 1;
                oiwVar.c = str2;
                Object obj12 = this.b;
                final zpw zpwVar = (zpw) obj12;
                String packageName = ((Context) zpwVar.n).getPackageName();
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar2 = (oiw) aihfVarCreateBuilder.instance;
                packageName.getClass();
                oiwVar2.b |= 2;
                oiwVar2.d = packageName;
                oihVar.e.g();
                final oiw oiwVar3 = (oiw) aihfVarCreateBuilder.build();
                final boolean z = true;
                ahcx ahcxVar = new ahcx() { // from class: ojg
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
                    @Override // defpackage.ahcx
                    public final ListenableFuture a() {
                        zpw zpwVar2 = zpwVar;
                        syn synVar = (syn) zpwVar2.f;
                        String str3 = okaVarA.a;
                        ListenableFuture listenableFutureQ = synVar.q(str3);
                        ListenableFuture listenableFutureQ2 = ((syn) zpwVar2.h).q(str3);
                        return qnl.aK(listenableFutureQ, listenableFutureQ2).O(new ojh(zpwVar2, listenableFutureQ, listenableFutureQ2, oiwVar3, z, oihVar, str2, 0), zpwVar2.o);
                    }
                };
                Object obj13 = zpwVar.a;
                ?? r3 = zpwVar.o;
                return ahno.as(((omj) obj13).c(ahcxVar, r3), new iub(obj12, obj11, 14, bArr), r3);
            case 8:
                ohz ohzVar = ((ohr) this.a).a;
                String str3 = ohzVar.c;
                String str4 = ohzVar.i;
                long j = ohzVar.h;
                int i2 = onb.a;
                int i3 = ohzVar.b & 2;
                Object obj14 = this.b;
                if (i3 != 0) {
                    Context context = (Context) ((zpw) obj14).n;
                    if (!context.getPackageName().equals(ohzVar.d)) {
                        onb.e("%s: Added group = '%s' with wrong owner package: '%s' v.s. '%s' ", "MobileDataDownload", ohzVar.c, context.getPackageName(), ohzVar.d);
                        return ahng.n(Boolean.FALSE);
                    }
                } else {
                    aihf builder = ohzVar.toBuilder();
                    String packageName2 = ((Context) ((zpw) obj14).n).getPackageName();
                    builder.copyOnWrite();
                    ohz ohzVar2 = (ohz) builder.instance;
                    packageName2.getClass();
                    ohzVar2.b |= 2;
                    ohzVar2.d = packageName2;
                    ohzVar = (ohz) builder.build();
                }
                aihf aihfVarCreateBuilder2 = oiw.a.createBuilder();
                String str5 = ohzVar.c;
                aihfVarCreateBuilder2.copyOnWrite();
                oiw oiwVar4 = (oiw) aihfVarCreateBuilder2.instance;
                str5.getClass();
                oiwVar4.b |= 1;
                oiwVar4.c = str5;
                String str6 = ohzVar.d;
                aihfVarCreateBuilder2.copyOnWrite();
                oiw oiwVar5 = (oiw) aihfVarCreateBuilder2.instance;
                str6.getClass();
                oiwVar5.b |= 2;
                oiwVar5.d = str6;
                try {
                    oip oipVar = (oip) aihn.parseFrom(oip.a, ohzVar.toByteArray(), ExtensionRegistryLite.a);
                    agke agkeVar = (agke) Collection.EL.stream(ohzVar.g).map(new iuk(oipVar, 11)).collect(aghu.a);
                    aihf builder2 = oipVar.toBuilder();
                    builder2.copyOnWrite();
                    ((oip) builder2.instance).o = oip.emptyProtobufList();
                    builder2.T(agkeVar);
                    final oip oipVar2 = (oip) builder2.build();
                    Object obj15 = ((zpw) obj14).j;
                    final oiw oiwVar6 = (oiw) aihfVarCreateBuilder2.build();
                    final ?? r4 = ((zpw) obj14).i;
                    String str7 = oiwVar6.c;
                    final olp olpVar = (olp) obj15;
                    return ahno.an(ahno.as(((olp) obj15).e(), new ahcy() { // from class: oln
                        /* JADX WARN: Code duplicated, block: B:101:0x0180  */
                        /* JADX WARN: Code duplicated, block: B:104:0x018e  */
                        /* JADX WARN: Code duplicated, block: B:106:0x019e  */
                        /* JADX WARN: Code duplicated, block: B:165:0x02cb  */
                        /* JADX WARN: Code duplicated, block: B:177:0x0305  */
                        /* JADX WARN: Code duplicated, block: B:179:0x0313  */
                        /* JADX WARN: Code duplicated, block: B:185:0x0329  */
                        /* JADX WARN: Code duplicated, block: B:187:0x0337  */
                        /* JADX WARN: Code duplicated, block: B:192:0x0348  */
                        /* JADX WARN: Code duplicated, block: B:193:0x034b  */
                        /* JADX WARN: Code duplicated, block: B:196:0x0362  */
                        /* JADX WARN: Code duplicated, block: B:197:0x0372  */
                        /* JADX WARN: Code duplicated, block: B:206:0x03d0 A[Catch: IOException -> 0x0477, okc -> 0x0484, omg -> 0x0486, oki -> 0x0488, TRY_ENTER, TryCatch #2 {IOException -> 0x0477, okc -> 0x0484, oki -> 0x0488, omg -> 0x0486, blocks: (B:203:0x03bc, B:206:0x03d0, B:208:0x03d8, B:210:0x03e6, B:211:0x03e8, B:215:0x03f3, B:216:0x0404, B:217:0x043d, B:218:0x0460, B:219:0x0461, B:220:0x0476), top: B:230:0x03bc }] */
                        /* JADX WARN: Code duplicated, block: B:208:0x03d8 A[Catch: IOException -> 0x0477, okc -> 0x0484, omg -> 0x0486, oki -> 0x0488, TryCatch #2 {IOException -> 0x0477, okc -> 0x0484, oki -> 0x0488, omg -> 0x0486, blocks: (B:203:0x03bc, B:206:0x03d0, B:208:0x03d8, B:210:0x03e6, B:211:0x03e8, B:215:0x03f3, B:216:0x0404, B:217:0x043d, B:218:0x0460, B:219:0x0461, B:220:0x0476), top: B:230:0x03bc }] */
                        /* JADX WARN: Code duplicated, block: B:210:0x03e6 A[Catch: IOException -> 0x0477, okc -> 0x0484, omg -> 0x0486, oki -> 0x0488, TryCatch #2 {IOException -> 0x0477, okc -> 0x0484, oki -> 0x0488, omg -> 0x0486, blocks: (B:203:0x03bc, B:206:0x03d0, B:208:0x03d8, B:210:0x03e6, B:211:0x03e8, B:215:0x03f3, B:216:0x0404, B:217:0x043d, B:218:0x0460, B:219:0x0461, B:220:0x0476), top: B:230:0x03bc }] */
                        /* JADX WARN: Code duplicated, block: B:217:0x043d A[Catch: IOException -> 0x0477, okc -> 0x0484, omg -> 0x0486, oki -> 0x0488, TryCatch #2 {IOException -> 0x0477, okc -> 0x0484, oki -> 0x0488, omg -> 0x0486, blocks: (B:203:0x03bc, B:206:0x03d0, B:208:0x03d8, B:210:0x03e6, B:211:0x03e8, B:215:0x03f3, B:216:0x0404, B:217:0x043d, B:218:0x0460, B:219:0x0461, B:220:0x0476), top: B:230:0x03bc }] */
                        /* JADX WARN: Code duplicated, block: B:219:0x0461 A[Catch: IOException -> 0x0477, okc -> 0x0484, omg -> 0x0486, oki -> 0x0488, TryCatch #2 {IOException -> 0x0477, okc -> 0x0484, oki -> 0x0488, omg -> 0x0486, blocks: (B:203:0x03bc, B:206:0x03d0, B:208:0x03d8, B:210:0x03e6, B:211:0x03e8, B:215:0x03f3, B:216:0x0404, B:217:0x043d, B:218:0x0460, B:219:0x0461, B:220:0x0476), top: B:230:0x03bc }] */
                        /* JADX WARN: Code duplicated, block: B:244:0x02e3 A[EDGE_INSN: B:244:0x02e3->B:172:0x02e3 BREAK  A[LOOP:0: B:12:0x004b->B:258:?], SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:245:0x01fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:257:0x021d A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:258:? A[LOOP:0: B:12:0x004b->B:258:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:259:0x0216 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:263:0x039e A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:264:0x0317 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:265:? A[LOOP:4: B:175:0x02ff->B:265:?, LOOP_END, SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:267:0x0395 A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:268:0x033c A[SYNTHETIC] */
                        /* JADX WARN: Code duplicated, block: B:87:0x0152  */
                        /* JADX WARN: Code duplicated, block: B:94:0x016e  */
                        /* JADX WARN: Code duplicated, block: B:96:0x0174  */
                        /* JADX WARN: Code duplicated, block: B:98:0x0178  */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, ola] */
                        /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, oii] */
                        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Executor] */
                        @Override // defpackage.ahcy
                        public final ListenableFuture a(Object obj16) {
                            aiie<oin> aiieVar;
                            Iterator it;
                            agke agkeVarN;
                            oip oipVar3;
                            xgg xggVar;
                            boolean zK;
                            oiw oiwVar7;
                            ListenableFuture listenableFutureN;
                            oir oirVar;
                            int iAU;
                            int iAU2;
                            agjz agjzVarF;
                            int iAU3;
                            aihf builder3;
                            String str8;
                            MessageDigest messageDigestB;
                            String strA;
                            int iAS;
                            int i4;
                            boolean z2;
                            String str9;
                            Iterator it2;
                            oii oiiVar;
                            oiq oiqVar;
                            String str10;
                            oii oiiVar2;
                            int iAU4;
                            atyn atynVar;
                            int iAU5;
                            oip oipVar4 = oipVar2;
                            boolean zIsEmpty = oipVar4.d.isEmpty();
                            ahcy ahcyVar = r4;
                            olp olpVar2 = olpVar;
                            if (!zIsEmpty) {
                                if (!oipVar4.d.contains("|")) {
                                    if (!oipVar4.e.contains("|")) {
                                        Iterator it3 = oipVar4.o.iterator();
                                        loop0: while (true) {
                                            if (!it3.hasNext()) {
                                                int i5 = 0;
                                                while (i5 < oipVar4.o.size()) {
                                                    int i6 = i5 + 1;
                                                    for (int i7 = i6; i7 < oipVar4.o.size(); i7++) {
                                                        if (((oin) oipVar4.o.get(i5)).c.equals(((oin) oipVar4.o.get(i7)).c)) {
                                                            onb.e("%s Repeated file id in added group = %s, file id = %s", "DataFileGroupValidator", oipVar4.d, ((oin) oipVar4.o.get(i5)).c);
                                                            break;
                                                        }
                                                    }
                                                    i5 = i6;
                                                }
                                                oir oirVar2 = oipVar4.m;
                                                if (oirVar2 == null) {
                                                    oirVar2 = oir.a;
                                                }
                                                int iAS2 = a.aS(oirVar2.d);
                                                if (iAS2 != 0 && iAS2 == 3) {
                                                    oir oirVar3 = oipVar4.m;
                                                    if (oirVar3 == null) {
                                                        oirVar3 = oir.a;
                                                    }
                                                    if (oirVar3.e <= 0) {
                                                        onb.c("%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0", "DataFileGroupValidator");
                                                        break;
                                                    }
                                                    if (qnl.bh(olpVar2.b)) {
                                                    }
                                                    aiieVar = oipVar4.o;
                                                    it = aiieVar.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            agkeVarN = agke.n(aiieVar);
                                                            break;
                                                        }
                                                        iAU2 = a.aU(((oin) it.next()).f);
                                                        if (iAU2 == 0) {
                                                            iAU2 = 1;
                                                        }
                                                        if (iAU2 == 2) {
                                                            agjzVarF = agke.f(aiieVar.size());
                                                            for (oin oinVar : aiieVar) {
                                                                iAU3 = a.aU(oinVar.f);
                                                                if (iAU3 == 0) {
                                                                    iAU3 = 1;
                                                                }
                                                                if (iAU3 - 1 != 0) {
                                                                    builder3 = oinVar.toBuilder();
                                                                    str8 = oinVar.d;
                                                                    messageDigestB = omu.b();
                                                                    if (messageDigestB == null) {
                                                                        strA = "";
                                                                    } else {
                                                                        byte[] bytes = str8.getBytes();
                                                                        messageDigestB.update(bytes, 0, bytes.length);
                                                                        strA = omu.a(messageDigestB.digest());
                                                                    }
                                                                    if (nsp.f(oinVar)) {
                                                                        builder3.copyOnWrite();
                                                                        oin oinVar2 = (oin) builder3.instance;
                                                                        oinVar2.b |= 64;
                                                                        oinVar2.i = strA;
                                                                    } else {
                                                                        builder3.copyOnWrite();
                                                                        oin oinVar3 = (oin) builder3.instance;
                                                                        oinVar3.b |= 16;
                                                                        oinVar3.g = strA;
                                                                    }
                                                                    oin oinVar4 = (oin) builder3.instance;
                                                                    String str11 = oinVar4.c;
                                                                    String str12 = oinVar4.g;
                                                                    int i8 = onb.a;
                                                                    agjzVarF.h((oin) builder3.build());
                                                                } else {
                                                                    agjzVarF.h(oinVar);
                                                                }
                                                            }
                                                            agkeVarN = agjzVarF.g();
                                                            break;
                                                        }
                                                    }
                                                    aihf builder4 = oipVar4.toBuilder();
                                                    builder4.copyOnWrite();
                                                    ((oip) builder4.instance).o = oip.emptyProtobufList();
                                                    builder4.T(agkeVarN);
                                                    oipVar3 = (oip) builder4.build();
                                                    xggVar = olpVar2.m;
                                                    zK = nsp.k(nsp.a(oipVar3), (omj) xggVar.i);
                                                    oiwVar7 = oiwVar6;
                                                    if (!zK) {
                                                        onb.d("%s: Trying to add expired group %s.", "FileGroupManager", oiwVar7.c);
                                                        xgg.C(1048, (ong) xggVar.d, oipVar3);
                                                        throw new oki();
                                                    }
                                                    if (xggVar.v(oiwVar7.d)) {
                                                        onb.e("%s: Trying to add group %s for uninstalled app %s.", "FileGroupManager", oiwVar7.c, oiwVar7.d);
                                                        xgg.C(1042, (ong) xggVar.d, oipVar3);
                                                        throw new omg();
                                                    }
                                                    listenableFutureN = ahng.n(null);
                                                    xggVar.l.v();
                                                    oirVar = oipVar3.m;
                                                    if (oirVar == null) {
                                                        oirVar = oir.a;
                                                    }
                                                    iAU = a.aU(oirVar.f);
                                                    if (iAU != 0) {
                                                        listenableFutureN = xggVar.s(xggVar.m.h(oiwVar7), new ojk(xggVar, oiwVar7, oipVar3, 17));
                                                    }
                                                    ooi ooiVarD = ooi.d(listenableFutureN);
                                                    ojk ojkVar = new ojk(xggVar, oiwVar7, oipVar3, 18);
                                                    ?? r9 = xggVar.k;
                                                    ooi ooiVarD2 = ooi.d(ooiVarD.f(ojkVar, r9).f(new ojk(xggVar, oiwVar7, oipVar3, 19), r9));
                                                    okx okxVar = new okx((Object) olpVar2, (Object) oiwVar7, (Object) ahcyVar, 8, (char[]) null);
                                                    Executor executor = olpVar2.g;
                                                    return ooiVarD2.f(okxVar, executor).e(new olk(2), executor);
                                                }
                                                if (qnl.bh(olpVar2.b) && (iAS = a.aS(oipVar4.j)) != 0 && iAS == 3) {
                                                    onb.c("%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key", "DataFileGroupValidator");
                                                    break;
                                                }
                                                aiieVar = oipVar4.o;
                                                it = aiieVar.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        agkeVarN = agke.n(aiieVar);
                                                        break;
                                                    }
                                                    iAU2 = a.aU(((oin) it.next()).f);
                                                    if (iAU2 == 0) {
                                                        iAU2 = 1;
                                                    }
                                                    if (iAU2 == 2) {
                                                        agjzVarF = agke.f(aiieVar.size());
                                                        while (r4.hasNext()) {
                                                            iAU3 = a.aU(oinVar.f);
                                                            if (iAU3 == 0) {
                                                                iAU3 = 1;
                                                            }
                                                            if (iAU3 - 1 != 0) {
                                                                builder3 = oinVar.toBuilder();
                                                                str8 = oinVar.d;
                                                                messageDigestB = omu.b();
                                                                if (messageDigestB == null) {
                                                                    strA = "";
                                                                } else {
                                                                    byte[] bytes2 = str8.getBytes();
                                                                    messageDigestB.update(bytes2, 0, bytes2.length);
                                                                    strA = omu.a(messageDigestB.digest());
                                                                }
                                                                if (nsp.f(oinVar)) {
                                                                    builder3.copyOnWrite();
                                                                    oin oinVar5 = (oin) builder3.instance;
                                                                    oinVar5.b |= 64;
                                                                    oinVar5.i = strA;
                                                                } else {
                                                                    builder3.copyOnWrite();
                                                                    oin oinVar6 = (oin) builder3.instance;
                                                                    oinVar6.b |= 16;
                                                                    oinVar6.g = strA;
                                                                }
                                                                oin oinVar7 = (oin) builder3.instance;
                                                                String str13 = oinVar7.c;
                                                                String str14 = oinVar7.g;
                                                                int i9 = onb.a;
                                                                agjzVarF.h((oin) builder3.build());
                                                            } else {
                                                                agjzVarF.h(oinVar);
                                                            }
                                                        }
                                                        agkeVarN = agjzVarF.g();
                                                        break;
                                                    }
                                                }
                                                aihf builder5 = oipVar4.toBuilder();
                                                builder5.copyOnWrite();
                                                ((oip) builder5.instance).o = oip.emptyProtobufList();
                                                builder5.T(agkeVarN);
                                                oipVar3 = (oip) builder5.build();
                                                try {
                                                    xggVar = olpVar2.m;
                                                    zK = nsp.k(nsp.a(oipVar3), (omj) xggVar.i);
                                                    oiwVar7 = oiwVar6;
                                                    if (!zK) {
                                                        onb.d("%s: Trying to add expired group %s.", "FileGroupManager", oiwVar7.c);
                                                        xgg.C(1048, (ong) xggVar.d, oipVar3);
                                                        throw new oki();
                                                    }
                                                    if (xggVar.v(oiwVar7.d)) {
                                                        onb.e("%s: Trying to add group %s for uninstalled app %s.", "FileGroupManager", oiwVar7.c, oiwVar7.d);
                                                        xgg.C(1042, (ong) xggVar.d, oipVar3);
                                                        throw new omg();
                                                    }
                                                    listenableFutureN = ahng.n(null);
                                                    xggVar.l.v();
                                                    oirVar = oipVar3.m;
                                                    if (oirVar == null) {
                                                        oirVar = oir.a;
                                                    }
                                                    iAU = a.aU(oirVar.f);
                                                    if (iAU != 0 && iAU == 2) {
                                                        listenableFutureN = xggVar.s(xggVar.m.h(oiwVar7), new ojk(xggVar, oiwVar7, oipVar3, 17));
                                                    }
                                                    ooi ooiVarD3 = ooi.d(listenableFutureN);
                                                    ojk ojkVar2 = new ojk(xggVar, oiwVar7, oipVar3, 18);
                                                    ?? r10 = xggVar.k;
                                                    ooi ooiVarD4 = ooi.d(ooiVarD3.f(ojkVar2, r10).f(new ojk(xggVar, oiwVar7, oipVar3, 19), r10));
                                                    okx okxVar2 = new okx((Object) olpVar2, (Object) oiwVar7, (Object) ahcyVar, 8, (char[]) null);
                                                    Executor executor2 = olpVar2.g;
                                                    return ooiVarD4.f(okxVar2, executor2).e(new olk(2), executor2);
                                                } catch (IOException e) {
                                                    onb.d("%s %s", "MDDManager", e.getClass());
                                                    return ahng.m(e);
                                                } catch (okc e2) {
                                                    e = e2;
                                                    onb.i("%s %s", "MDDManager", e.getClass());
                                                    return ahng.m(e);
                                                } catch (oki e3) {
                                                    e = e3;
                                                    onb.i("%s %s", "MDDManager", e.getClass());
                                                    return ahng.m(e);
                                                } catch (omg e4) {
                                                    e = e4;
                                                    onb.i("%s %s", "MDDManager", e.getClass());
                                                    return ahng.m(e);
                                                }
                                            }
                                            oin oinVar8 = (oin) it3.next();
                                            if (!oinVar8.c.isEmpty() && !oinVar8.c.contains("|")) {
                                                boolean z3 = !nsp.f(oinVar8) ? (oinVar8.b & 16) == 0 || oinVar8.g.isEmpty() : (oinVar8.b & 64) == 0 || oinVar8.i.isEmpty();
                                                int iAU6 = a.aU(oinVar8.f);
                                                if (iAU6 == 0) {
                                                    iAU6 = 1;
                                                }
                                                boolean z4 = (iAU6 - 1 != 0 ? !z3 : z3) | (nsp.f(oinVar8) && !z3);
                                                int iAU7 = a.aU(oinVar8.n);
                                                if (iAU7 != 0 && iAU7 == 2 && oinVar8.o.isEmpty()) {
                                                    i4 = 3;
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                    i4 = 3;
                                                }
                                                if (oinVar8.d.isEmpty() || oinVar8.d.contains("|") || oinVar8.e < 0 || !z4 || !z2 || nsp.e(oinVar8).contains("|")) {
                                                    String str15 = oipVar4.d;
                                                    String str16 = oinVar8.c;
                                                    Object[] objArr = new Object[i4];
                                                    objArr[0] = "DataFileGroupValidator";
                                                    objArr[1] = str15;
                                                    objArr[2] = str16;
                                                    onb.e("%s File details missing in added group = %s, file id = %s", objArr);
                                                    break;
                                                }
                                                oii oiiVar3 = olpVar2.i;
                                                if ((oinVar8.b & 32) == 0) {
                                                    if ((oinVar8.b & SemanticState.Hidden) != 0) {
                                                        str9 = oipVar4.d;
                                                        it2 = oinVar8.l.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                oiqVar = (oiq) it2.next();
                                                                if (!oiqVar.c.isEmpty() || oiqVar.c.contains("|") || (oiqVar.b & 2) == 0) {
                                                                    str10 = str9;
                                                                } else {
                                                                    oiiVar2 = oiiVar3;
                                                                    str10 = str9;
                                                                    if (oiqVar.d >= 0 && !oiqVar.e.isEmpty() && !oiqVar.e.contains("|")) {
                                                                        int i10 = oiqVar.b;
                                                                        if ((i10 & 8) != 0 && (iAU4 = a.aU(oiqVar.f)) != 0 && iAU4 != 1 && (i10 & 16) != 0) {
                                                                            oim oimVar = oiqVar.g;
                                                                            if (oimVar == null) {
                                                                                oimVar = oim.a;
                                                                            }
                                                                            if (!oimVar.b.isEmpty()) {
                                                                                oim oimVar2 = oiqVar.g;
                                                                                if (oimVar2 == null) {
                                                                                    oimVar2 = oim.a;
                                                                                }
                                                                                if (!oimVar2.b.contains("|")) {
                                                                                    oiiVar3 = oiiVar2;
                                                                                    str9 = str10;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                String str17 = oinVar8.c;
                                                                String str18 = oiqVar.c;
                                                                Object[] objArr2 = new Object[4];
                                                                objArr2[0] = "DataFileGroupValidator";
                                                                objArr2[1] = str10;
                                                                objArr2[2] = str17;
                                                                objArr2[i4] = str18;
                                                                onb.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr2);
                                                                break loop0;
                                                            }
                                                            oiiVar = oiiVar3;
                                                            if (nsp.j(oinVar8)) {
                                                                oiiVar.y();
                                                                String str19 = oipVar4.d;
                                                                String str20 = oinVar8.c;
                                                                String str21 = oinVar8.d;
                                                                Object[] objArr3 = new Object[4];
                                                                objArr3[0] = "DataFileGroupValidator";
                                                                objArr3[1] = str19;
                                                                objArr3[2] = str20;
                                                                objArr3[i4] = str21;
                                                                onb.e("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", objArr3);
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        atynVar = oinVar8.k;
                                                        if (atynVar == null) {
                                                            atynVar = atyn.a;
                                                        }
                                                        if (nsh.a(atynVar)) {
                                                            break;
                                                        }
                                                        str9 = oipVar4.d;
                                                        it2 = oinVar8.l.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                oiqVar = (oiq) it2.next();
                                                                if (oiqVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                String str110 = oinVar8.c;
                                                                String str111 = oiqVar.c;
                                                                Object[] objArr4 = new Object[4];
                                                                objArr4[0] = "DataFileGroupValidator";
                                                                objArr4[1] = str10;
                                                                objArr4[2] = str110;
                                                                objArr4[i4] = str111;
                                                                onb.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr4);
                                                                break loop0;
                                                            }
                                                            oiiVar = oiiVar3;
                                                            if (nsp.j(oinVar8)) {
                                                                oiiVar.y();
                                                                String str112 = oipVar4.d;
                                                                String str22 = oinVar8.c;
                                                                String str23 = oinVar8.d;
                                                                Object[] objArr5 = new Object[4];
                                                                objArr5[0] = "DataFileGroupValidator";
                                                                objArr5[1] = str112;
                                                                objArr5[2] = str22;
                                                                objArr5[i4] = str23;
                                                                onb.e("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", objArr5);
                                                                break;
                                                            }
                                                            oiiVar3 = oiiVar2;
                                                            str9 = str10;
                                                        }
                                                    }
                                                } else {
                                                    atyn atynVar2 = oinVar8.h;
                                                    if (atynVar2 == null) {
                                                        atynVar2 = atyn.a;
                                                    }
                                                    if (!nsh.a(atynVar2)) {
                                                        break;
                                                    }
                                                    String str24 = oipVar4.d;
                                                    if (!nsp.f(oinVar8)) {
                                                        iAU5 = a.aU(oinVar8.f);
                                                        if (iAU5 == 0) {
                                                            onb.d("Download checksum must be provided. Group = %s, file id = %s", oipVar4.d, oinVar8.c);
                                                            break;
                                                        }
                                                        onb.d("Download checksum must be provided. Group = %s, file id = %s", oipVar4.d, oinVar8.c);
                                                        break;
                                                    }
                                                    oiiVar3.l();
                                                    atyn atynVar3 = oinVar8.h;
                                                    if (atynVar3 == null) {
                                                        atynVar3 = atyn.a;
                                                    }
                                                    if (atynVar3.b.size() > 1) {
                                                        onb.d("Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s", str24, oinVar8.c);
                                                        break;
                                                    }
                                                    atyn atynVar4 = oinVar8.h;
                                                    if (atynVar4 == null) {
                                                        atynVar4 = atyn.a;
                                                    }
                                                    atym atymVar = (atym) atynVar4.b.get(0);
                                                    if (!"*".equals((atymVar.b == 4 ? (atyo) atymVar.c : atyo.a).c)) {
                                                        onb.d("Download zip folder transform can only have * as target. Group = %s, file id = %s", str24, oinVar8.c);
                                                        break;
                                                    }
                                                    iAU5 = a.aU(oinVar8.f);
                                                    if ((iAU5 == 0 || iAU5 != 2) && (oinVar8.b & 64) == 0) {
                                                        onb.d("Download checksum must be provided. Group = %s, file id = %s", oipVar4.d, oinVar8.c);
                                                        break;
                                                    }
                                                    if ((oinVar8.b & SemanticState.Hidden) != 0) {
                                                        atynVar = oinVar8.k;
                                                        if (atynVar == null) {
                                                            atynVar = atyn.a;
                                                        }
                                                        if (nsh.a(atynVar)) {
                                                            break;
                                                            break;
                                                        }
                                                        str9 = oipVar4.d;
                                                        it2 = oinVar8.l.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                oiqVar = (oiq) it2.next();
                                                                if (oiqVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                String str113 = oinVar8.c;
                                                                String str114 = oiqVar.c;
                                                                Object[] objArr6 = new Object[4];
                                                                objArr6[0] = "DataFileGroupValidator";
                                                                objArr6[1] = str10;
                                                                objArr6[2] = str113;
                                                                objArr6[i4] = str114;
                                                                onb.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr6);
                                                                break loop0;
                                                            }
                                                            oiiVar = oiiVar3;
                                                            if (nsp.j(oinVar8)) {
                                                                oiiVar.y();
                                                                String str115 = oipVar4.d;
                                                                String str25 = oinVar8.c;
                                                                String str26 = oinVar8.d;
                                                                Object[] objArr7 = new Object[4];
                                                                objArr7[0] = "DataFileGroupValidator";
                                                                objArr7[1] = str115;
                                                                objArr7[2] = str25;
                                                                objArr7[i4] = str26;
                                                                onb.e("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", objArr7);
                                                                break;
                                                            }
                                                            oiiVar3 = oiiVar2;
                                                            str9 = str10;
                                                        }
                                                    } else {
                                                        str9 = oipVar4.d;
                                                        it2 = oinVar8.l.iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                oiqVar = (oiq) it2.next();
                                                                if (oiqVar.c.isEmpty()) {
                                                                }
                                                                str10 = str9;
                                                                String str116 = oinVar8.c;
                                                                String str117 = oiqVar.c;
                                                                Object[] objArr8 = new Object[4];
                                                                objArr8[0] = "DataFileGroupValidator";
                                                                objArr8[1] = str10;
                                                                objArr8[2] = str116;
                                                                objArr8[i4] = str117;
                                                                onb.e("%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s.", objArr8);
                                                                break loop0;
                                                            }
                                                            oiiVar = oiiVar3;
                                                            if (nsp.j(oinVar8)) {
                                                                oiiVar.y();
                                                                String str118 = oipVar4.d;
                                                                String str27 = oinVar8.c;
                                                                String str28 = oinVar8.d;
                                                                Object[] objArr9 = new Object[4];
                                                                objArr9[0] = "DataFileGroupValidator";
                                                                objArr9[1] = str118;
                                                                objArr9[2] = str27;
                                                                objArr9[i4] = str28;
                                                                onb.e("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", objArr9);
                                                                break;
                                                            }
                                                            oiiVar3 = oiiVar2;
                                                            str9 = str10;
                                                        }
                                                    }
                                                }
                                            } else {
                                                i4 = 3;
                                                String str119 = oipVar4.d;
                                                String str120 = oinVar8.c;
                                                Object[] objArr10 = new Object[i4];
                                                objArr10[0] = "DataFileGroupValidator";
                                                objArr10[1] = str119;
                                                objArr10[2] = str120;
                                                onb.e("%s File details missing in added group = %s, file id = %s", objArr10);
                                                break;
                                            }
                                        }
                                    } else {
                                        onb.d("%s Owner package = %s contains '|'", "DataFileGroupValidator", oipVar4.e);
                                    }
                                } else {
                                    onb.d("%s Group name = %s contains '|'", "DataFileGroupValidator", oipVar4.d);
                                }
                            } else {
                                onb.c("%s Group name missing in added group", "DataFileGroupValidator");
                            }
                            olpVar2.k.k(1020, oipVar4.d, oipVar4.f, oipVar4.s, oipVar4.t);
                            return ahng.n(Boolean.FALSE);
                        }
                    }, ((olp) obj15).g), IOException.class, new gpr(17), ((zpw) obj14).o);
                } catch (aiik e) {
                    onb.g(e, "%s: Unable to convert from DataFileGroup to DataFileGroupInternal.", "MobileDataDownload");
                    return ahng.n(Boolean.FALSE);
                }
            case 9:
                Object obj16 = this.a;
                xgg xggVar = (xgg) this.b;
                oiw oiwVar7 = (oiw) obj16;
                ListenableFuture listenableFutureI = xggVar.i(oiwVar7, false);
                ListenableFuture listenableFutureI2 = xggVar.i(oiwVar7, true);
                return qnl.aK(listenableFutureI, listenableFutureI2).O(new gwj(listenableFutureI, listenableFutureI2, 10), xggVar.k);
            case 10:
                return ahng.n(new omi((oip) ahng.v(this.a), (oip) ahng.v(this.b)));
            case 11:
                Object obj17 = this.b;
                Object obj18 = this.a;
                try {
                    ?? r2 = ((syn) obj18).c;
                    r2.remove(obj17);
                    ((syn) obj18).d.b((String) obj17, r2.size());
                    return aher.a;
                } catch (Exception e2) {
                    onb.g(e2, "%s: Failed to remove download future (%s) from map", "DownloadFutureMap", obj17);
                    return ahng.m(e2);
                }
            case 12:
                qib qibVar = (qib) this.a;
                return qibVar.b(((qhz) qibVar.d.io()).c(this.b));
            case 13:
                qii qiiVar = (qii) this.a;
                if (!qiiVar.a.b(null)) {
                    return aher.a;
                }
                aihf aihfVar = (aihf) this.b;
                axgz axgzVar = (axgz) aihfVar.instance;
                int i4 = axgzVar.s;
                int iBc2 = a.bc(i4);
                if (((iBc2 != 0 && iBc2 == 3) || ((iBc = a.bc(i4)) != 0 && iBc == 2)) && (axgzVar.b & 16) == 0) {
                    return aher.a;
                }
                qid qidVar = (qid) qiiVar.b.io();
                agev agevVar = qidVar.b;
                agev agevVar2 = qidVar.a;
                agdf agdfVar = agdf.a;
                ListenableFuture listenableFutureN = ahng.n(agdfVar);
                ListenableFuture listenableFutureN2 = ahng.n(agdfVar);
                return ahng.h(listenableFutureN, listenableFutureN2).b(new ojj(qiiVar, aihfVar, listenableFutureN, listenableFutureN2, 5), MoreExecutors.directExecutor());
            case 14:
                Object obj19 = this.b;
                qrg qrgVar = (qrg) obj19;
                Uri uri = (Uri) ahng.v(qrgVar.b);
                qqc qqcVar = new qqc((Closeable) qrgVar.h.X(uri, new qqp(3)));
                Object obj20 = this.a;
                try {
                    try {
                        ((qrg) obj19).e(uri);
                        listenableFutureM = aher.a;
                        break;
                    } catch (Throwable th) {
                        try {
                            qqcVar.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    listenableFutureM = qrg.g(e3) ? ahng.m(e3) : ((qrb) obj20).a(e3, ((qrg) obj19).e);
                }
                ListenableFuture listenableFutureB = qrg.b(listenableFutureM, qqcVar.a());
                qqcVar.close();
                return listenableFutureB;
            case 15:
                ((rsk) ((sbn) this.a).a.io()).q(Arrays.asList((sni) this.b));
                return aher.a;
            case 16:
                ((rsk) ((sbs) this.a).a.io()).q(this.b);
                return aher.a;
            case 17:
                scc sccVar = (scc) this.a;
                tun tunVar = sccVar.b;
                long jB = tunVar.c.b();
                long j2 = tunVar.a;
                long j3 = j2 != -1 ? jB - j2 : -1L;
                Object obj21 = this.b;
                if (j3 >= 0) {
                    ((rsk) sccVar.a.io()).q(Arrays.asList((sni) obj21));
                } else {
                    sccVar.b((sni) obj21, -j3);
                }
                return aher.a;
            case 18:
                Object obj22 = this.a;
                sym symVar = (sym) obj22;
                symVar.c.an();
                try {
                    return this.b.a(((sym) obj22).b);
                } catch (Throwable th3) {
                    symVar.c.ap();
                    return ahng.m(th3);
                }
            case 19:
                Object obj23 = this.a;
                syn synVar = (syn) obj23;
                ((dov) synVar.c).an();
                try {
                    return this.b.a((qrx) ((syn) obj23).d.io());
                } catch (Throwable th4) {
                    ((dov) synVar.c).ap();
                    return ahng.m(th4);
                }
            default:
                tps tpsVar = (tps) this.a;
                SharedPreferences.Editor editorEdit = tpsVar.a.edit();
                MessageLite messageLiteE = tpsVar.e(editorEdit, this.b);
                if (!editorEdit.commit()) {
                    return ahng.m(new IllegalStateException("Failed to store data to SharedPreferences"));
                }
                tpsVar.b.kk(messageLiteE);
                return ahng.n(null);
        }
    }

    public /* synthetic */ gwj(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
