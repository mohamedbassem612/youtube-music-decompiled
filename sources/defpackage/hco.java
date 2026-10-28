package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.composition.api.EmbedResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardCopyOption;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Comparator$EL;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hco implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hco(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x07b3 A[Catch: all -> 0x07fb, TryCatch #4 {, blocks: (B:165:0x06d5, B:167:0x06db, B:169:0x06ff, B:171:0x0707, B:173:0x070d, B:175:0x0715, B:177:0x0721, B:179:0x0727, B:181:0x072f, B:183:0x0737, B:185:0x073d, B:189:0x0749, B:191:0x074f, B:192:0x0754, B:197:0x0760, B:186:0x0742, B:187:0x0745, B:200:0x0763, B:202:0x076b, B:203:0x0783, B:205:0x078e, B:206:0x07af, B:207:0x07b1, B:209:0x07b3, B:210:0x07ea, B:213:0x07f1, B:214:0x07f3, B:217:0x07f6, B:193:0x0755, B:194:0x075d, B:211:0x07eb, B:212:0x07f0), top: B:243:0x06d5, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x07eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v58, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v76, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v78, types: [aaqt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v84, types: [aaqt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.agek
    public final Object apply(Object obj) throws IOException {
        byte[] bArr;
        List list;
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem;
        ArrayList<String> stringArrayList;
        zne zneVar;
        hir hirVar;
        aamm aammVarE;
        int i;
        int i2 = 14;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                bArr = null;
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                hcp hcpVar = (hcp) this.a;
                zwb zwbVar = hcpVar.d;
                hcpVar.h.A((zwbVar == null || !(zwbVar.e() instanceof rlt)) ? "anonymous" : ((rlt) zwbVar.e()).b, (Bitmap) this.b, bundle2, this.c, null);
                break;
            case 1:
                return ((gqh) this.a).e((woo) this.c, (wfy) obj, (gnl) this.b);
            case 2:
                Map map = (Map) obj;
                ((agrc) ((agrc) hia.b.c()).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentFetcher", "prepareOfflineTreeAsync", 499, "LocalContentFetcher.java")).t("Finish fetching offline media items.");
                Object obj2 = this.a;
                Object obj3 = this.c;
                Object obj4 = this.b;
                synchronized (((hia) obj4).r) {
                    if (map == null) {
                        aunn aunnVar = ((hia) obj4).d;
                        hir hirVar2 = (hir) aunnVar.io();
                        zneVar = gzl.f;
                        hirVar2.a(zneVar).e();
                        ((hir) aunnVar.io()).a((zne) obj2).l(((zne) obj2).a(), yno.ai(gzl.a));
                        hirVar = (hir) aunnVar.io();
                        synchronized (hirVar.a) {
                            hirVar.e.remove(zneVar);
                            return Boolean.FALSE;
                        }
                    }
                    if (map.isEmpty()) {
                        aunn aunnVar2 = ((hia) obj4).d;
                        hir hirVar3 = (hir) aunnVar2.io();
                        zneVar = gzl.f;
                        hirVar3.a(zneVar).e();
                        ((hir) aunnVar2.io()).a((zne) obj2).l(((zne) obj2).a(), yno.ai(gzl.a));
                        hirVar = (hir) aunnVar2.io();
                        synchronized (hirVar.a) {
                            try {
                                hirVar.e.remove(zneVar);
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        return Boolean.FALSE;
                    }
                    ((hia) obj4).l("MBS: offline tree prepared for client: %s", obj2);
                    ((jgc) ((hia) obj4).e.io()).k((String) obj3);
                    String str = gzl.a;
                    if (map.containsKey(str) && (list = (List) map.get(str)) != null && !list.isEmpty() && (mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) list.get(0)) != null && TextUtils.equals(mediaBrowserCompat$MediaItem.a(), "__NO_OP_DOWNLOADS_PROGRESS_ID__")) {
                        Bundle bundle3 = mediaBrowserCompat$MediaItem.a.f;
                        agke agkeVarN = (bundle3 == null || !bundle3.containsKey("com.google.android.apps.youtube.music.mediabrowser.pending_downloads") || (stringArrayList = bundle3.getStringArrayList("com.google.android.apps.youtube.music.mediabrowser.pending_downloads")) == null || stringArrayList.isEmpty()) ? agpi.a : agke.n(stringArrayList);
                        if (agkeVarN != null && !agkeVarN.isEmpty()) {
                            synchronized (((hia) obj4).t) {
                                try {
                                    ((hia) obj4).u.addAll(agkeVarN);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        break;
                    }
                    if (map.containsKey(gzl.a)) {
                        ((hir) ((hia) obj4).d.io()).a(gzl.f).m(hia.e(map));
                    }
                    if (!((zne) obj2).equals(znd.a)) {
                        ((hir) ((hia) obj4).d.io()).a((zne) obj2).k(((zne) obj2).a(), ((hia) obj4).d());
                    }
                    return Boolean.TRUE;
                    throw th;
                }
            case 3:
                Stream stream = Collection.EL.stream((List) obj);
                Object obj5 = this.c;
                Object obj6 = this.b;
                Stream streamSorted = stream.filter(new iab(obj6, obj5, i3)).sorted(new hlw((aofy) this.a));
                iad iadVar = (iad) obj6;
                agke agkeVar = (agke) streamSorted.map(new hqs(iadVar.c, i2)).collect(aghu.a);
                return iac.a(aamh.b("PPAD", agkeVar.size(), iadVar.a.getString(R.string.offline_songs_title)), agkeVar);
            case 4:
                List list2 = (List) obj;
                int size = list2.size();
                Object obj7 = this.b;
                ixd ixdVar = (ixd) obj7;
                anto antoVar = ixdVar.f;
                Object obj8 = this.c;
                if (size < antoVar.d) {
                    return obj8;
                }
                Object obj9 = this.a;
                aihf builder = ((aihn) obj8).toBuilder();
                aihh aihhVar = (aihh) apji.a.createBuilder();
                aihhVar.e(anln.a, obj9);
                builder.copyOnWrite();
                anlm anlmVar = (anlm) builder.instance;
                apji apjiVar = (apji) aihhVar.build();
                apjiVar.getClass();
                anlmVar.c = apjiVar;
                anlmVar.b |= 1;
                aigj aigjVar = antoVar.f;
                builder.copyOnWrite();
                anlm anlmVar2 = (anlm) builder.instance;
                aigjVar.getClass();
                anlmVar2.b |= 8;
                anlmVar2.f = aigjVar;
                Iterable iterable = (Iterable) Collection.EL.stream(list2).sorted(Comparator$EL.reversed(ixdVar.d)).limit(antoVar.e).filter(new iui(5)).map(new iuk(obj7, 3)).map(new ixa(i3)).collect(Collectors.toList());
                builder.copyOnWrite();
                anlm anlmVar3 = (anlm) builder.instance;
                aiie aiieVar = anlmVar3.d;
                if (!aiieVar.c()) {
                    anlmVar3.d = aihn.mutableCopy(aiieVar);
                }
                aifs.addAll(iterable, anlmVar3.d);
                return (anlm) builder.build();
            case 5:
                bArr = null;
                if (((Boolean) obj).booleanValue()) {
                    ((AtomicInteger) this.c).getAndIncrement();
                } else {
                    Object obj10 = this.b;
                    ((ong) ((omn) this.a).a).j(1036);
                    onb.d("%s: Unsubscribe from file %s failed!", "ExpirationHandler", obj10);
                }
                break;
            case 6:
                bArr = null;
                ((rff) this.b).q((rht) this.a);
                ((rif) this.c).w();
                break;
            case 7:
                bArr = null;
                Object obj11 = this.a;
                rff rffVar = (rff) this.b;
                rffVar.q((rht) obj11);
                ((ria) this.c).h(Duration.ZERO, rffVar.c.n());
                break;
            case 8:
                bArr = null;
                smr smrVar = (smr) obj;
                skm skmVar = (skm) smrVar.d(siq.class);
                ajwo ajwoVar = (ajwo) smrVar.d(sjv.class);
                Map map2 = (Map) smrVar.d(sjt.class);
                String str2 = (String) smrVar.d(sjh.class);
                String str3 = (String) smrVar.d(sib.class);
                sgn sgnVar = (sgn) smrVar.d(shn.class);
                ajwo ajwoVar2 = true == Objects.equals(ajwoVar, ajwo.a) ? null : ajwoVar;
                agev agevVar = (agev) this.a;
                boolean zG = agevVar.g();
                Object obj12 = this.b;
                if (zG) {
                    rvk rvkVar = (rvk) obj12;
                    return rvkVar.b.p(rvkVar.a, str2, skmVar, (ajlj) agevVar.c(), ajwoVar2, map2, str3, sgnVar);
                }
                ?? r0 = this.c;
                if (r0 != 0 && !r0.isEmpty()) {
                    rvk rvkVar2 = (rvk) obj12;
                    return rvkVar2.b.q(rvkVar2.a, str2, skmVar, r0, ajwoVar2, map2, str3, sgnVar);
                }
                break;
            case 9:
                smr smrVar2 = (smr) obj;
                return ((rwa) this.b).a(smrVar2, (skm) smrVar2.d(siq.class), this.a, this.c, (ListenableFuture) smrVar2.d(sju.class), (ListenableFuture) smrVar2.d(sjs.class), (String) smrVar2.d(sjh.class), (String) smrVar2.d(sib.class), (sgn) smrVar2.d(shn.class));
            case 10:
                EmbedResult embedResult = (EmbedResult) obj;
                Object obj13 = this.c;
                Object obj14 = this.a;
                if (embedResult != EmbedResult.EMBEDDED) {
                    ((File) obj14).delete();
                    return embedResult;
                }
                try {
                    try {
                        Files.move(FileRetargetClass.toPath((File) obj14), FileRetargetClass.toPath((File) obj13), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE).getClass();
                        return embedResult;
                    } catch (Exception unused) {
                        Files.move(FileRetargetClass.toPath((File) obj14), FileRetargetClass.toPath((File) obj13), StandardCopyOption.REPLACE_EXISTING).getClass();
                        return embedResult;
                    }
                } catch (Exception e) {
                    File file = (File) obj14;
                    File file2 = (File) obj13;
                    if (file.renameTo(file2)) {
                        return embedResult;
                    }
                    Object obj15 = this.b;
                    String absolutePath = file2.getAbsolutePath();
                    absolutePath.getClass();
                    uhg uhgVar = ((uhc) obj15).f;
                    String strA = uhgVar.a(absolutePath);
                    String absolutePath2 = file.getAbsolutePath();
                    absolutePath2.getClass();
                    throw new IOException("Failed to replace " + strA + " with " + uhgVar.a(absolutePath2), e);
                }
            case 11:
                vmx vmxVar = (vmx) this.b;
                Optional optional = (Optional) vmxVar.a.io();
                Object obj16 = this.c;
                bArr = null;
                sda sdaVar = new sda((alrk) obj, obj16, 13, bArr);
                if (true == optional.isPresent()) {
                    ((ahgb) optional.get()).aj((alrk) sdaVar.b, (ajwo) sdaVar.a, new HashMap());
                }
                vmxVar.e(agke.q(obj16), this.a);
                break;
            case 12:
                vmx vmxVar2 = (vmx) this.b;
                Optional optional2 = (Optional) vmxVar2.a.io();
                Object obj17 = this.c;
                sda sdaVar2 = new sda((alri) obj, obj17, i2, null);
                if (true == optional2.isPresent()) {
                    ((ahgb) optional2.get()).ah((alri) sdaVar2.b, (ajwo) sdaVar2.a, new HashMap());
                }
                vmxVar2.e(agke.q(obj17), this.a);
                return null;
            case 13:
                vmx vmxVar3 = (vmx) this.b;
                Optional optional3 = (Optional) vmxVar3.a.io();
                Object obj18 = this.c;
                sda sdaVar3 = new sda((alrm) obj, obj18, 12, null);
                if (true == optional3.isPresent()) {
                    ((ahgb) optional3.get()).ak((alrm) sdaVar3.b, (ajwo) sdaVar3.a, new HashMap());
                }
                vmxVar3.e(agke.q(obj18), this.a);
                return null;
            case 14:
                if (((xpl) this.b).k(((aigj) this.c.get(this.a)).G(), (byte[]) obj).e()) {
                    return null;
                }
                throw new SecurityException();
            case 15:
                agjz agjzVar = new agjz(4);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    aamt aamtVarB = this.a.b((String) it.next(), false);
                    agjzVar.h(aamtVarB != null ? ((aagy) this.b).h(aamtVarB) : Optional.empty());
                }
                return agjzVar.g();
            case 16:
                agjz agjzVar2 = new agjz(4);
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    agjzVar2.h(((aald) this.b).a.b(this.a.b((String) it2.next(), false)));
                }
                return agjzVar2.g();
            case 17:
                aalp.c(this.c, (agkj) this.a);
                return this.b;
            case 18:
                int i4 = 2;
                agkj agkjVar = (agkj) obj;
                for (aihf aihfVar : this.a) {
                    Object obj19 = this.b;
                    aohq aohqVar = (aohq) agkjVar.get(((aoei) aihfVar.instance).c);
                    Optional optionalOfNullable = Optional.ofNullable((aqph) ((agkj) obj19).get(((aoei) aihfVar.instance).c));
                    if (true == optionalOfNullable.isPresent()) {
                        optionalOfNullable = Optional.ofNullable(((aqph) optionalOfNullable.get()).getIsExternalMedia());
                    }
                    boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(Boolean.FALSE)).booleanValue();
                    if (aohqVar != null && (aammVarE = aamm.e(((aoei) aihfVar.instance).c, aohqVar)) != null) {
                        ?? r11 = this.c;
                        aaml aamlVar = aammVarE.a;
                        aamc aamcVarC = aamlVar != 0 ? aamlVar.c(r11, zBooleanValue) : null;
                        aaml aamlVar2 = aammVarE.b;
                        aamc aamcVarC2 = aamlVar2 != 0 ? aamlVar2.c(r11, zBooleanValue) : null;
                        String str4 = aamcVarC != null ? aamcVarC.a : null;
                        String str5 = aamcVarC2 != null ? aamcVarC2.a : null;
                        boolean z = (aamlVar == 0 || aamcVarC != null) && (aamlVar2 == 0 || aamcVarC2 != null);
                        aihfVar.copyOnWrite();
                        aoei aoeiVar = (aoei) aihfVar.instance;
                        aoeiVar.b |= 65536;
                        aoeiVar.p = z;
                        boolean z2 = !aammVarE.h;
                        aihfVar.copyOnWrite();
                        aoei aoeiVar2 = (aoei) aihfVar.instance;
                        aoeiVar2.b |= 131072;
                        aoeiVar2.q = z2;
                        if (str4 == null) {
                            str4 = str5;
                        }
                        aqdf aqdfVarB = aals.b(str4);
                        aihfVar.copyOnWrite();
                        aoei aoeiVar3 = (aoei) aihfVar.instance;
                        aqdfVarB.getClass();
                        aoeiVar3.r = aqdfVarB;
                        aoeiVar3.b |= 262144;
                        int iG = agvp.G(aoeiVar3.d);
                        if (iG != 0 && iG == (i = i4) && !z) {
                            aihfVar.copyOnWrite();
                            aoei aoeiVar4 = (aoei) aihfVar.instance;
                            aoeiVar4.d = 10;
                            aoeiVar4.b |= i;
                        }
                        long j = 0;
                        long j2 = 0;
                        for (aqdp aqdpVar : aohqVar.getStreamsProgress()) {
                            j += aqdpVar.d;
                            j2 += aqdpVar.c;
                        }
                        aihfVar.copyOnWrite();
                        aoei aoeiVar5 = (aoei) aihfVar.instance;
                        aoeiVar5.b |= 8;
                        aoeiVar5.f = j;
                        aihfVar.copyOnWrite();
                        aoei aoeiVar6 = (aoei) aihfVar.instance;
                        aoeiVar6.b |= 16;
                        aoeiVar6.g = j2;
                    }
                    i4 = 2;
                }
                return null;
            case 19:
                agkj agkjVar2 = (agkj) obj;
                for (aihf aihfVar2 : this.a) {
                    aohk aohkVar = (aohk) agkjVar2.get(((aoei) aihfVar2.instance).c);
                    if (aohkVar != null) {
                        ?? r10 = this.c;
                        Object obj20 = this.b;
                        aony aonyVar = (aony) r10.get(((aoei) aihfVar2.instance).c);
                        long millis = Duration.ofSeconds(aohkVar.getLastUpdatedTimestampSeconds().longValue()).toMillis();
                        aihfVar2.copyOnWrite();
                        aoei aoeiVar7 = (aoei) aihfVar2.instance;
                        aoeiVar7.b |= SemanticState.Hidden;
                        aoeiVar7.k = millis;
                        long epochSecond = ((aalp) obj20).a.f().getEpochSecond();
                        long jLongValue = aohkVar.getExpirationTimestamp().longValue();
                        aihfVar2.copyOnWrite();
                        aoei aoeiVar8 = (aoei) aihfVar2.instance;
                        aoeiVar8.b |= SemanticState.LiveRegion;
                        aoeiVar8.l = jLongValue - epochSecond;
                        if (jLongValue <= epochSecond) {
                            aihfVar2.copyOnWrite();
                            aoei aoeiVar9 = (aoei) aihfVar2.instance;
                            aoeiVar9.d = 8;
                            aoeiVar9.b |= 2;
                            aofp aofpVar = aofp.OFFLINE_PLAYBACK_DISABLED_REASON_CLIENT_OFFLINE_CONTENT_EXPIRED;
                            aihfVar2.copyOnWrite();
                            aoei aoeiVar10 = (aoei) aihfVar2.instance;
                            aoeiVar10.w = aofpVar.m;
                            aoeiVar10.b |= 16777216;
                        }
                        if (aonyVar != null) {
                            if (aaje.r(aonyVar)) {
                                aohh action = aohkVar.getAction();
                                if (action == aohh.OFFLINE_VIDEO_POLICY_ACTION_UNKNOWN || action == aohh.OFFLINE_VIDEO_POLICY_ACTION_DISABLE) {
                                    aihfVar2.copyOnWrite();
                                    aoei aoeiVar11 = (aoei) aihfVar2.instance;
                                    aoeiVar11.d = 7;
                                    aoeiVar11.b |= 2;
                                }
                                if ((aohkVar.c.b & SemanticState.LiveRegion) != 0) {
                                    aofp offlinePlaybackDisabledReason = aohkVar.getOfflinePlaybackDisabledReason();
                                    aihfVar2.copyOnWrite();
                                    aoei aoeiVar12 = (aoei) aihfVar2.instance;
                                    aoeiVar12.w = offlinePlaybackDisabledReason.m;
                                    aoeiVar12.b |= 16777216;
                                }
                            } else if (aaje.t(aonyVar)) {
                                aihfVar2.copyOnWrite();
                                aoei aoeiVar13 = (aoei) aihfVar2.instance;
                                aoeiVar13.d = 16;
                                aoeiVar13.b |= 2;
                            } else {
                                aihfVar2.copyOnWrite();
                                aoei aoeiVar14 = (aoei) aihfVar2.instance;
                                aoeiVar14.d = 4;
                                aoeiVar14.b |= 2;
                                aofp aofpVar2 = aofp.OFFLINE_PLAYBACK_DISABLED_REASON_CLIENT_UNPLAYABLE_PLAYER_RESPONSE;
                                aihfVar2.copyOnWrite();
                                aoei aoeiVar15 = (aoei) aihfVar2.instance;
                                aoeiVar15.w = aofpVar2.m;
                                aoeiVar15.b |= 16777216;
                            }
                        }
                    }
                }
                return null;
            default:
                return ((aapa) this.b).e((abnl) this.a, (abnp) this.c);
        }
        return bArr;
    }

    public /* synthetic */ hco(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ hco(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ hco(Object obj, Object obj2, List list, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = list;
    }

    public /* synthetic */ hco(ArrayList arrayList, agkj agkjVar, agke agkeVar, int i) {
        this.$cid = i;
        this.c = arrayList;
        this.a = agkjVar;
        this.b = agkeVar;
    }
}
