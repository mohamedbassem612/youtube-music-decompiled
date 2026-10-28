package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import com.google.android.libraries.elements.interfaces.Snapshot;
import com.google.android.libraries.elements.interfaces.TransactionRecord;
import com.google.android.libraries.youtube.engagementpanel.LinearScrollToItemLayoutManager;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.MessageLite;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uqd implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uqd(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, zwa] */
    /* JADX WARN: Type inference failed for: r0v83, types: [java.lang.Object, tqo] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, tqo] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, sxu] */
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
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                Iterator it = ((xte) this.a).f.iterator();
                while (it.hasNext()) {
                    ((uqe) it.next()).a((String) this.b);
                }
                return;
            case 1:
                ((ulp) this.a).l((Optional) this.b);
                return;
            case 2:
                akuf akufVar = (akuf) this.b;
                ((vor) this.a).x(akufVar.b == 138681066 ? (akuj) akufVar.c : akuj.b, null, false, null, true, null);
                return;
            case 3:
                Drawable drawableCreateFromPath = Drawable.createFromPath(((File) this.b).getPath());
                if (drawableCreateFromPath != null) {
                    ((View) this.a).setBackground(drawableCreateFromPath);
                    return;
                }
                return;
            case 4:
                File file = (File) this.a;
                if (file.exists() && file.delete()) {
                    return;
                }
                ((agrc) ((agrc) vhi.a.b()).k("com/google/android/libraries/youtube/creation/videoeffects/fragment/StickerClickHandler", "deleteTextAssetFile", 104, "StickerClickHandler.java")).w("Failed to delete text asset: %s", this.b);
                return;
            case 5:
                Object obj = this.b;
                Object obj2 = this.a;
                vhz vhzVar = (vhz) obj2;
                String str = (String) obj;
                vhzVar.g = str;
                if (str.length() == 0 && !vhzVar.j.m(5, 45617552L)) {
                    vhzVar.f.clear();
                    vhzVar.i.a(true);
                    return;
                }
                gtg gtgVar = new gtg(obj2, 8);
                HashMap map = new HashMap();
                map.put("com.google.android.libraries.youtube.innertube.services.social.query", obj);
                map.put("com.google.android.libraries.youtube.innertube.services.social.listener", gtgVar);
                vhzVar.b.c(vhzVar.c, map);
                return;
            case 6:
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    via viaVar = (via) this.a;
                    ((vic) viaVar.a).a(Uri.parse((String) it2.next()), viaVar.d);
                }
                return;
            case 7:
                Object obj3 = ((Optional) ((aeiv) this.a).c).get();
                taq.c();
                syw sywVar = (syw) obj3;
                if (sywVar.b != null) {
                    ?? r12 = this.b;
                    long epochMilli = sywVar.d.f().toEpochMilli();
                    Iterator it3 = r12.iterator();
                    while (it3.hasNext()) {
                        File file2 = new File(sywVar.b, (String) it3.next());
                        try {
                            if (file2.exists() && !file2.setLastModified(epochMilli)) {
                                ((agrc) ((agrc) syw.a.b()).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "updateCache", 148, "TtlDiskCache.java")).w("Unable to update timestamp for %s", file2.getPath());
                            }
                        } catch (SecurityException e) {
                            ((agrc) ((agrc) ((agrc) syw.a.b()).j(e)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "updateCache", (char) 152, "TtlDiskCache.java")).t("Exception in modifying file's last modified timestamp");
                        }
                    }
                    File file3 = sywVar.b;
                    ArrayList<File> arrayList = new ArrayList();
                    syw.b(file3, arrayList);
                    for (File file4 : arrayList) {
                        try {
                            if (epochMilli - file4.lastModified() > ((syw) obj3).c) {
                                file4.delete();
                            }
                        } catch (SecurityException e2) {
                            ((agrc) ((agrc) ((agrc) syw.a.b()).j(e2)).k("com/google/android/libraries/youtube/common/cache/TtlDiskCache", "updateCache", (char) 168, "TtlDiskCache.java")).t("Exception in examining/deleting existing file");
                        }
                    }
                    return;
                }
                return;
            case 8:
                akku akkuVar = akku.DELAYED_EVENT_TIER_IMMEDIATE;
                aihf aihfVarCreateBuilder = jrc.a.createBuilder();
                vmu vmuVar = (vmu) this.a;
                String strK = vmuVar.a.hw().k();
                aihfVarCreateBuilder.copyOnWrite();
                jrc jrcVar = (jrc) aihfVarCreateBuilder.instance;
                jrcVar.b |= 16;
                jrcVar.g = strK;
                aihfVarCreateBuilder.copyOnWrite();
                jrc jrcVar2 = (jrc) aihfVarCreateBuilder.instance;
                jrcVar2.b |= 2;
                jrcVar2.d = "likes";
                aigj byteString = ((aifs) this.b).toByteString();
                aihfVarCreateBuilder.copyOnWrite();
                jrc jrcVar3 = (jrc) aihfVarCreateBuilder.instance;
                jrcVar3.b |= 4;
                jrcVar3.e = byteString;
                vmuVar.b.t(akkuVar, aihfVarCreateBuilder);
                return;
            case 9:
                LinearScrollToItemLayoutManager linearScrollToItemLayoutManager = (LinearScrollToItemLayoutManager) this.b;
                linearScrollToItemLayoutManager.d((vpu) this.a, linearScrollToItemLayoutManager.b);
                return;
            case 10:
                Object obj4 = this.a;
                if (((vsh) obj4).isAdded()) {
                    vsk vskVar = ((vsj) this.b).a;
                    dd supportFragmentManager = vskVar.b.getSupportFragmentManager();
                    if (vskVar.a(supportFragmentManager)) {
                        av avVar = new av(supportFragmentManager);
                        avVar.l((cc) obj4);
                        avVar.e();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((vwi) this.a).a.g((String) this.b, false);
                return;
            case 12:
                Object obj5 = this.b;
                Object obj6 = this.a;
                synchronized (obj6) {
                    ((vwi) obj6).a.i((String) obj5);
                    break;
                }
                return;
            case 13:
                Object obj7 = this.a;
                wao waoVar = (wao) obj7;
                Object obj8 = waoVar.f;
                Object obj9 = this.b;
                synchronized (obj8) {
                    if (((wao) obj7).c.remove(obj9)) {
                        SettableFuture settableFuture = null;
                        do {
                            synchronized (waoVar.f) {
                                if (settableFuture != null) {
                                    ((wao) obj7).c.remove(settableFuture);
                                }
                                settableFuture = (SettableFuture) ((wao) obj7).b.pollLast();
                                if (settableFuture != null) {
                                    ((aghi) ((wao) obj7).c).f(settableFuture, 1);
                                } else {
                                    ((wao) obj7).a++;
                                }
                                break;
                            }
                            if (settableFuture == null) {
                                return;
                            }
                        } while (!settableFuture.set(null));
                        return;
                    }
                    return;
                }
            case 14:
                TransactionRecord transactionRecord = (TransactionRecord) this.a;
                Snapshot snapshotBeginState = transactionRecord.beginState();
                snapshotBeginState.getClass();
                Snapshot snapshotEndState = transactionRecord.endState();
                snapshotEndState.getClass();
                Iterator it4 = transactionRecord.keys().iterator();
                it4.getClass();
                while (it4.hasNext()) {
                    Object obj10 = this.b;
                    String str2 = (String) it4.next();
                    wck wckVar = (wck) obj10;
                    Class clsB = wckVar.f.b(str2);
                    awly awlyVar = (awly) wckVar.c.get(str2);
                    awly awlyVar2 = (awly) wckVar.d.get(clsB);
                    if (awlyVar != null || awlyVar2 != null) {
                        weo weoVarF = wckVar.b.f(str2, snapshotBeginState, snapshotEndState);
                        if (weoVarF != null) {
                            if (awlyVar != null) {
                                awlyVar.kk(weoVarF);
                            }
                            if (awlyVar2 != null) {
                                awlyVar2.kk(weoVarF);
                            }
                        }
                    }
                }
                return;
            case 15:
                this.b.remove(this.a);
                return;
            case 16:
                ?? r0 = this.b;
                wdc wdcVar = (wdc) this.a;
                wdcVar.b.c(wdcVar.a, r0);
                return;
            case 17:
                ?? r1 = this.b;
                wdg wdgVar = (wdg) this.a;
                wdgVar.b.c(wdgVar.a, r1);
                return;
            case 18:
                wjz wjzVar = (wjz) this.a;
                Set set = (Set) wjzVar.c.io();
                if (set == null || set.isEmpty()) {
                    return;
                }
                for (Object obj11 : wjzVar.b.a(this.b)) {
                    Iterator it5 = set.iterator();
                    while (it5.hasNext()) {
                        ((wjw) it5.next()).a(obj11);
                    }
                }
                return;
            case 19:
                ?? r2 = this.a;
                wll wllVar = (wll) this.b;
                wllVar.k(r2);
                if (wllVar.g.e <= 0 || wllVar.f.e <= 0) {
                    return;
                }
                wllVar.g();
                return;
            default:
                ?? r3 = this.a;
                wll wllVar2 = (wll) this.b;
                wllVar2.l(r3.f());
                if (wllVar2.g.e <= 0 || wllVar2.f.e <= 0) {
                    return;
                }
                wllVar2.g();
                return;
        }
    }

    public /* synthetic */ uqd(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public uqd(wjz wjzVar, MessageLite messageLite, int i) {
        this.$cid = i;
        this.b = messageLite;
        this.a = wjzVar;
    }
}
