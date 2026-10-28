package defpackage;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hni implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hni(aakk aakkVar, wcn wcnVar, String str, String str2, File file, int i) {
        this.$cid = i;
        this.b = aakkVar;
        this.a = wcnVar;
        this.d = str;
        this.e = str2;
        this.c = file;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0738  */
    /* JADX WARN: Code duplicated, block: B:191:0x079b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v151, types: [java.lang.Object, nwg] */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object, nrw] */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v167, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v173, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v176, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v186, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v189, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v197, types: [java.lang.Object, xir] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v115, types: [java.lang.Object, wcn] */
    /* JADX WARN: Type inference failed for: r2v118, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v121, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, mbb] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.lang.Object, tns] */
    /* JADX WARN: Type inference failed for: r3v68, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v71, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.concurrent.Future] */
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
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        Optional optionalOfNullable;
        Object obj;
        Object obj2;
        aihf aihfVarCreateBuilder;
        int i = 7;
        int i2 = 16;
        int i3 = 6;
        int i4 = 2;
        int i5 = 4;
        int i6 = 0;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                kyr kyrVar = (kyr) ahng.v(this.b);
                ?? r6 = kyrVar.b;
                int size = r6.size();
                ?? r0 = kyrVar.a;
                int size2 = size + r0.size();
                List list = (List) ahng.v(this.c);
                List list2 = (List) ahng.v(this.d);
                int size3 = size2 + list.size() + list2.size();
                aihf aihfVarCreateBuilder2 = apoq.a.createBuilder();
                Object obj3 = this.a;
                hnl hnlVar = (hnl) obj3;
                kyr kyrVar2 = hnlVar.f;
                Optional optionalX = kyrVar2.x(R.string.library_albums_shelf_title, list2);
                gtr gtrVar = new gtr(obj3, aihfVarCreateBuilder2, i3);
                if (true == optionalX.isPresent()) {
                    Object obj4 = optionalX.get();
                    Object obj5 = gtrVar.a;
                    Object obj6 = gtrVar.b;
                    aihf aihfVarCreateBuilder3 = apox.a.createBuilder();
                    aihfVarCreateBuilder3.copyOnWrite();
                    apox apoxVar = (apox) aihfVarCreateBuilder3.instance;
                    apoxVar.aq = (anwt) obj4;
                    apoxVar.c |= 536870912;
                    ((aihf) obj6).ck(aihfVarCreateBuilder3);
                    ((hnl) obj5).f(122508);
                }
                Optional optionalX2 = kyrVar2.x(R.string.library_playlists_shelf_title, list);
                gtr gtrVar2 = new gtr(obj3, aihfVarCreateBuilder2, i);
                if (true == optionalX2.isPresent()) {
                    Object obj7 = optionalX2.get();
                    Object obj8 = gtrVar2.a;
                    Object obj9 = gtrVar2.b;
                    aihf aihfVarCreateBuilder4 = apox.a.createBuilder();
                    aihfVarCreateBuilder4.copyOnWrite();
                    apox apoxVar2 = (apox) aihfVarCreateBuilder4.instance;
                    apoxVar2.aq = (anwt) obj7;
                    apoxVar2.c |= 536870912;
                    ((aihf) obj9).ck(aihfVarCreateBuilder4);
                    ((hnl) obj8).f(122509);
                }
                Optional optionalX3 = kyrVar2.x(R.string.library_songs_shelf_title, r6);
                gtr gtrVar3 = new gtr(obj3, aihfVarCreateBuilder2, 8);
                if (true == optionalX3.isPresent()) {
                    Object obj10 = optionalX3.get();
                    Object obj11 = gtrVar3.a;
                    Object obj12 = gtrVar3.b;
                    aihf aihfVarCreateBuilder5 = apox.a.createBuilder();
                    aihfVarCreateBuilder5.copyOnWrite();
                    apox apoxVar3 = (apox) aihfVarCreateBuilder5.instance;
                    apoxVar3.aq = (anwt) obj10;
                    apoxVar3.c |= 536870912;
                    ((aihf) obj12).ck(aihfVarCreateBuilder5);
                    ((hnl) obj11).f(122510);
                }
                Optional optionalX4 = kyrVar2.x(R.string.library_episodes_shelf_title, r0);
                gtr gtrVar4 = new gtr(obj3, aihfVarCreateBuilder2, 9);
                if (true == optionalX4.isPresent()) {
                    Object obj13 = optionalX4.get();
                    Object obj14 = gtrVar4.a;
                    Object obj15 = gtrVar4.b;
                    aihf aihfVarCreateBuilder6 = apox.a.createBuilder();
                    aihfVarCreateBuilder6.copyOnWrite();
                    apox apoxVar4 = (apox) aihfVarCreateBuilder6.instance;
                    apoxVar4.aq = (anwt) obj13;
                    apoxVar4.c |= 536870912;
                    ((aihf) obj15).ck(aihfVarCreateBuilder6);
                    ((hnl) obj14).f(202020);
                }
                if (((apoq) aihfVarCreateBuilder2.instance).f.size() == 0) {
                    Object obj16 = this.e;
                    aihf aihfVarCreateBuilder7 = apox.a.createBuilder();
                    angn angnVarW = kyrVar2.w((String) obj16);
                    aihfVarCreateBuilder7.copyOnWrite();
                    apox apoxVar5 = (apox) aihfVarCreateBuilder7.instance;
                    angnVarW.getClass();
                    apoxVar5.bc = angnVarW;
                    apoxVar5.e |= 8;
                    aihfVarCreateBuilder2.ci((apox) aihfVarCreateBuilder7.build());
                    hnlVar.f(124924);
                }
                return new hnk((apoq) aihfVarCreateBuilder2.build(), size3);
            case 1:
                Bitmap bitmap = (Bitmap) ahng.v(this.d);
                Object obj17 = this.c;
                ((gys) this.b).e.A(null, bitmap, (Bundle) this.a, obj17 == null ? null : agke.q(obj17), ((araz) this.e).c);
                return null;
            case 2:
                Optional optional = (Optional) ahng.v(this.c);
                Object obj18 = this.b;
                hge hgeVar = new hge(obj18, i5);
                if (true == optional.isPresent()) {
                    Object obj19 = optional.get();
                    Object obj20 = hgeVar.a;
                    annv annvVar = (annv) ((weh) obj19);
                    Stream.CC.concat(Collection.EL.stream(annvVar.g()), Collection.EL.stream(annvVar.e())).forEach(new gmk(obj20, i2));
                    Stream.CC.concat(Collection.EL.stream(annvVar.j()), Collection.EL.stream(annvVar.i())).forEach(new gmk(obj20, 17));
                }
                ?? r1 = this.d;
                Object obj21 = this.a;
                Collection.EL.stream((agke) ahng.v(r1)).forEach(new gmk(obj18, 15));
                hnz hnzVar = (hnz) obj21;
                if (hnzVar.l.l(66, 45858271L, false)) {
                    return obj18;
                }
                hnzVar.g((wog) obj18, ((Boolean) ahng.v(this.e)).booleanValue());
                return obj18;
            case 3:
                ?? r2 = this.c;
                List list3 = (List) ahng.v(r2);
                String str = (String) this.e;
                anui anuiVarF = anuk.f(kro.ay(str));
                anuiVarF.am(str);
                Object obj22 = this.a;
                int iHashCode = str.hashCode();
                if (iHashCode != -1928212878) {
                    if (iHashCode != 2462802) {
                        if (iHashCode == 2462819 && str.equals("PPSV")) {
                            string = ((hoj) obj22).e.getString(R.string.offline_songs_detail_page_title);
                        } else {
                            string = "";
                        }
                    } else if (str.equals("PPSE")) {
                        string = ((hoj) obj22).i.b();
                    } else {
                        string = "";
                    }
                } else if (str.equals("PPSDST")) {
                    string = ((hoj) obj22).e.getString(R.string.recent_music_playlist_title);
                } else {
                    string = "";
                }
                anuiVarF.ao(string);
                anuiVarF.ap(Long.valueOf(list3.size()));
                int iHashCode2 = str.hashCode();
                if (iHashCode2 != -1928212878) {
                    if (iHashCode2 != 2462802) {
                        if (iHashCode2 == 2462819 && str.equals("PPSV")) {
                            optionalOfNullable = Optional.ofNullable(ixt.y(((hoj) obj22).e, hlz.b));
                        } else {
                            optionalOfNullable = Optional.empty();
                        }
                    } else if (str.equals("PPSE")) {
                        optionalOfNullable = Optional.ofNullable(ixt.y(((hoj) obj22).e, hlz.c));
                    } else {
                        optionalOfNullable = Optional.empty();
                    }
                } else if (str.equals("PPSDST")) {
                    optionalOfNullable = Optional.ofNullable(ixt.y(((hoj) obj22).e, hlz.a));
                } else {
                    optionalOfNullable = Optional.empty();
                }
                hge hgeVar2 = new hge(anuiVarF, i);
                if (true == optionalOfNullable.isPresent()) {
                    ((anui) hgeVar2.a).an((aqmh) optionalOfNullable.get());
                }
                this.b.d(((hoj) obj22).d(anuiVarF.aq(), (List) ahng.v(r2), (List) ahng.v(this.d), str.equals("PPSDST"), Optional.empty()));
                return null;
            case 4:
                Optional optionalOfNullable2 = (Optional) ahng.v(this.c);
                agke agkeVar = (agke) ahng.v(this.d);
                boolean zBooleanValue = ((Boolean) ahng.v(this.e)).booleanValue();
                aihf aihfVarCreateBuilder8 = alln.a.createBuilder();
                aihf aihfVarCreateBuilder9 = allu.a.createBuilder();
                aihfVarCreateBuilder9.copyOnWrite();
                allu alluVar = (allu) aihfVarCreateBuilder9.instance;
                alluVar.b |= 1;
                alluVar.c = zBooleanValue;
                boolean zG = ((hsn) this.a).e.g();
                aihfVarCreateBuilder9.copyOnWrite();
                allu alluVar2 = (allu) aihfVarCreateBuilder9.instance;
                alluVar2.b |= 2;
                alluVar2.d = zG;
                aihfVarCreateBuilder8.copyOnWrite();
                alln allnVar = (alln) aihfVarCreateBuilder8.instance;
                allu alluVar3 = (allu) aihfVarCreateBuilder9.build();
                alluVar3.getClass();
                allnVar.c = alluVar3;
                allnVar.b = 1;
                alln allnVar2 = (alln) aihfVarCreateBuilder8.build();
                Object obj23 = this.b;
                ((wog) obj23).b = allnVar2;
                hqb hqbVar = new hqb(agkeVar, obj23, i4, bArr);
                if (true == optionalOfNullable2.isPresent()) {
                    Object obj24 = optionalOfNullable2.get();
                    ?? r3 = hqbVar.b;
                    Object obj25 = hqbVar.a;
                    annv annvVar2 = (annv) ((weh) obj24);
                    Collection.EL.stream(annvVar2.e()).forEach(new hsk(obj25, i3));
                    Collection.EL.stream(annvVar2.g()).forEach(new hsk(obj25, i6));
                    Collection.EL.stream(annvVar2.i()).forEach(new hsk(obj25, i4));
                    Collection.EL.stream(annvVar2.j()).forEach(new hsk(obj25, 3));
                    Collection.EL.stream(r3).forEach(new hsk(obj25, i5));
                    optionalOfNullable2 = Optional.ofNullable(obj25);
                }
                return (wog) optionalOfNullable2.orElse(obj23);
            case 5:
                List list4 = (List) ahng.v(this.a);
                ?? r4 = this.d;
                r4.addAll(list4);
                kyr kyrVar3 = (kyr) ahng.v(this.b);
                Object obj26 = kyrVar3.b;
                ?? r12 = this.e;
                if (obj26 != null) {
                    r4.add(obj26);
                    String strA = ((MediaBrowserCompat$MediaItem) obj26).a();
                    if (strA != null) {
                        r12.put(strA, kyrVar3.a);
                    }
                }
                kyr kyrVar4 = (kyr) ahng.v(this.c);
                if (kyrVar4 != null && (obj = kyrVar4.b) != null) {
                    r4.add(obj);
                    String strA2 = ((MediaBrowserCompat$MediaItem) obj).a();
                    if (strA2 != null) {
                        r12.put(strA2, kyrVar4.a);
                    }
                }
                if (r4.isEmpty()) {
                    return r12;
                }
                r12.put(gzl.a, r4);
                return r12;
            case 6:
                Iterator it = ((List) ahng.v(this.a)).iterator();
                while (true) {
                    ?? r13 = this.e;
                    ?? r5 = this.d;
                    if (!it.hasNext()) {
                        kyr kyrVar5 = (kyr) ahng.v(this.b);
                        Object obj27 = kyrVar5.b;
                        if (obj27 != null) {
                            r5.add(obj27);
                            String strA3 = ((MediaBrowserCompat$MediaItem) obj27).a();
                            if (strA3 != null) {
                                r13.put(strA3, kyrVar5.a);
                            }
                        }
                        kyr kyrVar6 = (kyr) ahng.v(this.c);
                        if (kyrVar6 != null && (obj2 = kyrVar6.b) != null) {
                            r5.add(obj2);
                            String strA4 = ((MediaBrowserCompat$MediaItem) obj2).a();
                            if (strA4 != null) {
                                r13.put(strA4, kyrVar6.a);
                            }
                        }
                        if (r5.isEmpty()) {
                            return r13;
                        }
                        r13.put(gzl.a, r5);
                        return r13;
                    }
                    Pair pair = (Pair) it.next();
                    r5.add((MediaBrowserCompat$MediaItem) pair.first);
                    String strA5 = ((MediaBrowserCompat$MediaItem) pair.first).a();
                    if (strA5 != null) {
                        r13.put(strA5, (List) pair.second);
                    }
                }
                break;
            case 7:
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((java.util.Collection) ahng.v(this.b));
                arrayList.addAll((java.util.Collection) ahng.v(this.c));
                arrayList.addAll((java.util.Collection) ahng.v(this.d));
                String str2 = (String) this.e;
                xsc xscVar = new xsc(str2);
                for (Object obj28 : arrayList) {
                    HashMap map = (HashMap) xscVar.c;
                    if (!map.containsKey(obj28)) {
                        map.put(obj28, Integer.valueOf(hmy.p((String) xscVar.a, obj28) - 1));
                    }
                }
                HashMap map2 = (HashMap) xscVar.c;
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    Integer num = (Integer) entry.getValue();
                    if (num != null && num.intValue() > 0) {
                        arrayList2.add(key);
                    }
                }
                arrayList2.trimToSize();
                Collections.sort(arrayList2, xscVar.b);
                ahgb ahgbVar = new ahgb(null);
                ?? r7 = ahgbVar.d;
                ArrayList arrayList3 = (ArrayList) r7;
                arrayList3.clear();
                ?? r8 = ahgbVar.c;
                ArrayList arrayList4 = (ArrayList) r8;
                arrayList4.clear();
                ?? r9 = ahgbVar.a;
                ArrayList arrayList5 = (ArrayList) r9;
                arrayList5.clear();
                ((aha) ahgbVar.e).clear();
                EnumMap enumMap = new EnumMap(hui.class);
                for (Object obj29 : arrayList2) {
                    if (obj29 instanceof anyx) {
                        arrayList3.add((anyx) obj29);
                    } else if (obj29 instanceof anuk) {
                        arrayList4.add((anuk) obj29);
                    } else if (obj29 instanceof anjx) {
                        arrayList5.add((anjx) obj29);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    enumMap.put(hui.b, new ArrayList((java.util.Collection) r7));
                }
                if (!arrayList4.isEmpty()) {
                    enumMap.put(hui.c, new ArrayList((java.util.Collection) r8));
                }
                if (!arrayList5.isEmpty()) {
                    enumMap.put(hui.d, new ArrayList((java.util.Collection) r9));
                }
                ArrayList arrayList6 = new ArrayList();
                ahgbVar.ad(str2, r7, arrayList6);
                ahgbVar.ad(str2, r8, arrayList6);
                ahgbVar.ad(str2, r9, arrayList6);
                Collections.sort(arrayList6, ahgbVar.b);
                Optional optionalEmpty = arrayList6.isEmpty() ? Optional.empty() : Optional.of(arrayList6.get(0));
                hge hgeVar3 = new hge(enumMap, i2);
                if (true != optionalEmpty.isPresent()) {
                    return enumMap;
                }
                hgeVar3.a.put(hui.a, agke.q(optionalEmpty.get()));
                return enumMap;
            case 8:
                aihf aihfVarCreateBuilder10 = apoq.a.createBuilder();
                Object obj30 = this.a;
                ?? r10 = this.b;
                ?? r11 = this.c;
                ?? r14 = this.d;
                try {
                    Optional optionalX5 = ((itj) obj30).e.x(R.string.library_songs_shelf_title, (List) ahng.v(r10));
                    imc imcVar = new imc(aihfVarCreateBuilder10, i5);
                    if (true == optionalX5.isPresent()) {
                        Object obj31 = optionalX5.get();
                        Object obj32 = imcVar.a;
                        aihf aihfVarCreateBuilder11 = apox.a.createBuilder();
                        aihfVarCreateBuilder11.copyOnWrite();
                        apox apoxVar6 = (apox) aihfVarCreateBuilder11.instance;
                        apoxVar6.aq = (anwt) obj31;
                        apoxVar6.c |= 536870912;
                        ((aihf) obj32).ck(aihfVarCreateBuilder11);
                    }
                    break;
                } catch (ExecutionException e) {
                    ((agrc) ((agrc) ((agrc) itj.a.b()).j(e)).k("com/google/android/apps/youtube/music/sideloaded/search/SideloadedSearchService", "createAllResultsRenderer", (char) 193, "SideloadedSearchService.java")).t("Error occurred getting sideloaded tracks search results");
                }
                try {
                    Optional optionalX6 = ((itj) obj30).e.x(R.string.library_albums_shelf_title, (List) ahng.v(r11));
                    imc imcVar2 = new imc(aihfVarCreateBuilder10, 5);
                    if (true == optionalX6.isPresent()) {
                        Object obj33 = optionalX6.get();
                        Object obj34 = imcVar2.a;
                        aihf aihfVarCreateBuilder12 = apox.a.createBuilder();
                        aihfVarCreateBuilder12.copyOnWrite();
                        apox apoxVar7 = (apox) aihfVarCreateBuilder12.instance;
                        apoxVar7.aq = (anwt) obj33;
                        apoxVar7.c |= 536870912;
                        ((aihf) obj34).ck(aihfVarCreateBuilder12);
                    }
                    break;
                } catch (ExecutionException e2) {
                    ((agrc) ((agrc) ((agrc) itj.a.b()).j(e2)).k("com/google/android/apps/youtube/music/sideloaded/search/SideloadedSearchService", "createAllResultsRenderer", (char) 208, "SideloadedSearchService.java")).t("Error occurred getting sideloaded albums search results");
                }
                try {
                    Optional optionalX7 = ((itj) obj30).e.x(R.string.library_artists_shelf_title, (List) ahng.v(r14));
                    imc imcVar3 = new imc(aihfVarCreateBuilder10, i3);
                    if (true == optionalX7.isPresent()) {
                        Object obj35 = optionalX7.get();
                        Object obj36 = imcVar3.a;
                        aihf aihfVarCreateBuilder13 = apox.a.createBuilder();
                        aihfVarCreateBuilder13.copyOnWrite();
                        apox apoxVar8 = (apox) aihfVarCreateBuilder13.instance;
                        apoxVar8.aq = (anwt) obj35;
                        apoxVar8.c |= 536870912;
                        ((aihf) obj36).ck(aihfVarCreateBuilder13);
                    }
                    break;
                } catch (ExecutionException e3) {
                    ((agrc) ((agrc) ((agrc) itj.a.b()).j(e3)).k("com/google/android/apps/youtube/music/sideloaded/search/SideloadedSearchService", "createAllResultsRenderer", (char) 223, "SideloadedSearchService.java")).t("Error occurred getting sideloaded artists search results");
                }
                if (((apoq) aihfVarCreateBuilder10.instance).f.size() == 0) {
                    Object obj37 = this.e;
                    aihf aihfVarCreateBuilder14 = apox.a.createBuilder();
                    angn angnVarW2 = ((itj) obj30).e.w((String) obj37);
                    aihfVarCreateBuilder14.copyOnWrite();
                    apox apoxVar9 = (apox) aihfVarCreateBuilder14.instance;
                    angnVarW2.getClass();
                    apoxVar9.bc = angnVarW2;
                    apoxVar9.e |= 8;
                    aihfVarCreateBuilder10.ci((apox) aihfVarCreateBuilder14.build());
                }
                return (apoq) aihfVarCreateBuilder10.build();
            case 9:
                ?? r15 = this.d;
                Object obj38 = this.b;
                Object obj39 = this.e;
                Object obj40 = this.a;
                return r15 != 0 ? mqq.d(r15, (CommandOuterClass$Command) obj39, ((nrv) obj38).f(), ((mqq) obj40).c) : mqq.c(this.c, (CommandOuterClass$Command) obj39, (nrv) obj38, ((mqq) obj40).c);
            case 10:
                if (!((spm) this.b).a.containsKey(this.d)) {
                    String str3 = ((shg) this.a).a;
                    spl splVar = spl.PREFETCH_SERVICE_INITIALIZED;
                    return null;
                }
                Object obj41 = this.e;
                Object obj42 = this.c;
                spl splVar2 = spl.PREFETCH_SERVICE_INITIALIZED;
                spo spoVar = (spo) obj42;
                String str4 = (String) obj41;
                spoVar.d(str4);
                spoVar.a(str4);
                return null;
            case 11:
                Object objV = ahng.v(this.b);
                Boolean bool = Boolean.TRUE;
                boolean zEquals = Objects.equals(objV, bool);
                ?? r16 = this.a;
                if (zEquals || Objects.equals(ahng.v(this.c), bool)) {
                    Object obj43 = this.e;
                    r16.s();
                    ((Duration) obj43).toMillis();
                }
                if (!(r16 instanceof zyn) || !Objects.equals(ahng.v(this.d), bool)) {
                    return null;
                }
                agqs agqsVarListIterator = ((agke) r16.L()).listIterator(0);
                while (agqsVarListIterator.hasNext()) {
                }
                return null;
            case 12:
                ug ugVar = (ug) ahng.v(this.b);
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll((java.util.Collection) ahng.v(this.c));
                arrayList7.addAll((java.util.Collection) ahng.v(this.d));
                ((aajr) this.a).f.f(4, this.e);
                atwh atwhVar = new atwh(null);
                atwhVar.a(arrayList7);
                return (rv) ugVar.i(atwhVar.b()).get();
            case 13:
                String absolutePath = ((File) this.c).getAbsolutePath();
                amta amtaVarE = amtc.e((String) this.d);
                amtaVarE.an((String) this.e);
                amtaVarE.am(absolutePath);
                amtc amtcVarAo = amtaVarE.ao();
                wer werVarE = this.a.e();
                werVarE.e(amtcVarAo);
                return werVarE.b().r(((aakk) this.b).a).B(avmc.t(amtcVarAo));
            case 14:
                agke agkeVar2 = (agke) ahng.v(this.b);
                agkj agkjVar = (agkj) ahng.v(this.c);
                agjz agjzVar = new agjz(4);
                int size4 = agkeVar2.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    aoei aoeiVar = (aoei) agkeVar2.get(i7);
                    String str5 = aoeiVar.c;
                    if ((aoeiVar.b & 2097152) != 0) {
                        aoeh aoehVar = aoeiVar.u;
                        if (aoehVar == null) {
                            aoehVar = aoeh.a;
                        }
                        aihfVarCreateBuilder = aoehVar.toBuilder();
                    } else {
                        aihfVarCreateBuilder = aoeh.a.createBuilder();
                    }
                    aqph aqphVar = (aqph) agkjVar.get(str5);
                    aihf builder = aoeiVar.toBuilder();
                    boolean z = aqphVar != null;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoeh aoehVar2 = (aoeh) aihfVarCreateBuilder.instance;
                    aoehVar2.b |= 16;
                    aoehVar2.f = z;
                    int size5 = aqphVar != null ? aqphVar.h().size() : 0;
                    aihfVarCreateBuilder.copyOnWrite();
                    aoeh aoehVar3 = (aoeh) aihfVarCreateBuilder.instance;
                    aoehVar3.b |= SemanticState.Hidden;
                    aoehVar3.h = size5;
                    builder.copyOnWrite();
                    aoei aoeiVar2 = (aoei) builder.instance;
                    aoeh aoehVar4 = (aoeh) aihfVarCreateBuilder.build();
                    aoehVar4.getClass();
                    aoeiVar2.u = aoehVar4;
                    aoeiVar2.b |= 2097152;
                    agjzVar.h((aoei) builder.build());
                }
                ?? r17 = this.e;
                ?? r18 = this.d;
                Object obj44 = this.a;
                agke agkeVarG = agjzVar.g();
                agke agkeVar3 = (agke) Collection.EL.stream((agke) ahng.v(r18)).map(new woi((agkj) Collection.EL.stream(agkeVarG).collect(aghu.a(new aakc(13), new aakc(14))), 18)).collect(aghu.a);
                aodx aodxVar = (aodx) ahng.v(r17);
                aihf aihfVarCreateBuilder15 = aoec.a.createBuilder();
                aihfVarCreateBuilder15.copyOnWrite();
                aoec aoecVar = (aoec) aihfVarCreateBuilder15.instance;
                aoecVar.b();
                aifs.addAll(agkeVarG, aoecVar.c);
                aihfVarCreateBuilder15.copyOnWrite();
                aoec aoecVar2 = (aoec) aihfVarCreateBuilder15.instance;
                aoecVar2.a();
                aifs.addAll(agkeVar3, aoecVar2.d);
                aihfVarCreateBuilder15.copyOnWrite();
                aoec aoecVar3 = (aoec) aihfVarCreateBuilder15.instance;
                aodxVar.getClass();
                aoecVar3.f = aodxVar;
                aoecVar3.b |= SemanticState.ReadOnly;
                long jB = ((aals) obj44).e.b();
                aihfVarCreateBuilder15.copyOnWrite();
                aoec aoecVar4 = (aoec) aihfVarCreateBuilder15.instance;
                aoecVar4.b |= 1;
                aoecVar4.e = jB;
                return (aoec) aihfVarCreateBuilder15.build();
            default:
                ?? r19 = this.b;
                Object obj45 = this.d;
                Object obj46 = this.a;
                Object obj47 = this.e;
                Object obj48 = this.c;
                try {
                    synchronized (((aegn) obj48).b) {
                        try {
                            URL url = new URL((String) obj47);
                            AtomicReference atomicReference = ((aegn) obj48).g;
                            if (!Objects.equals(obj46, atomicReference.get())) {
                                ((aegn) obj48).g();
                            }
                            long jB2 = ((aegn) obj48).c.b();
                            long j = 3600000 + jB2;
                            aihf aihfVarCreateBuilder16 = amjm.a.createBuilder();
                            aihfVarCreateBuilder16.copyOnWrite();
                            amjm amjmVar = (amjm) aihfVarCreateBuilder16.instance;
                            amjmVar.b |= 4;
                            amjmVar.e = true;
                            if (obj45 != null) {
                                aihfVarCreateBuilder16.copyOnWrite();
                                amjm amjmVar2 = (amjm) aihfVarCreateBuilder16.instance;
                                amjmVar2.c = ((arkf) obj45).z;
                                amjmVar2.b |= 1;
                            }
                            Map map3 = ((aegn) obj48).h;
                            if (!map3.containsKey(url.getHost()) || jB2 >= ((Long) map3.get(url.getHost())).longValue()) {
                                aegn.s(r19, (amjm) aihfVarCreateBuilder16.build());
                                ((aegn) obj48).k.o((Account) obj46, (String) obj47);
                                map3.put(url.getHost(), Long.valueOf(j));
                                atomicReference.set(obj46);
                            } else {
                                aihfVarCreateBuilder16.copyOnWrite();
                                amjm amjmVar3 = (amjm) aihfVarCreateBuilder16.instance;
                                amjmVar3.b |= 2;
                                amjmVar3.d = true;
                                map3.put(url.getHost(), Long.valueOf(j));
                                aegn.s(r19, (amjm) aihfVarCreateBuilder16.build());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException | jxr | jye unused) {
                    aegn.r("WebLoginHelperException");
                }
                return null;
        }
    }

    public /* synthetic */ hni(aegn aegnVar, String str, Account account, arkf arkfVar, xir xirVar, int i) {
        this.$cid = i;
        this.c = aegnVar;
        this.e = str;
        this.a = account;
        this.d = arkfVar;
        this.b = xirVar;
    }

    public /* synthetic */ hni(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, String str, hmy hmyVar, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.d = listenableFuture3;
        this.e = str;
        this.a = hmyVar;
    }

    public /* synthetic */ hni(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, tns tnsVar, Duration duration, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.b = listenableFuture;
        this.c = listenableFuture2;
        this.a = tnsVar;
        this.e = duration;
        this.d = listenableFuture3;
    }

    public /* synthetic */ hni(ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, Map map, ListenableFuture listenableFuture3, int i) {
        this.$cid = i;
        this.a = listenableFuture;
        this.d = list;
        this.b = listenableFuture2;
        this.e = map;
        this.c = listenableFuture3;
    }

    public /* synthetic */ hni(hoj hojVar, ListenableFuture listenableFuture, String str, ListenableFuture listenableFuture2, mbb mbbVar, int i) {
        this.$cid = i;
        this.a = hojVar;
        this.c = listenableFuture;
        this.e = str;
        this.d = listenableFuture2;
        this.b = mbbVar;
    }

    public /* synthetic */ hni(hsn hsnVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, ListenableFuture listenableFuture3, wog wogVar, int i) {
        this.$cid = i;
        this.a = hsnVar;
        this.c = listenableFuture;
        this.d = listenableFuture2;
        this.e = listenableFuture3;
        this.b = wogVar;
    }

    public /* synthetic */ hni(Object obj, Object obj2, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
        this.c = listenableFuture;
        this.d = listenableFuture2;
        this.e = obj3;
    }

    public /* synthetic */ hni(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$cid = i;
        this.b = obj;
        this.d = obj2;
        this.a = obj3;
        this.c = obj4;
        this.e = obj5;
    }

    public /* synthetic */ hni(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.c = obj5;
    }
}
