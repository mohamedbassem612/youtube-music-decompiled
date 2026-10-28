package defpackage;

import android.net.Uri;
import android.provider.MediaStore;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isv implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ isv(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) throws FileNotFoundException {
        File[] fileArrListFiles;
        int i = 7;
        byte[] bArr = null;
        int i2 = 16;
        int i3 = 13;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj2 = this.a;
                iqj iqjVar = new iqj(19);
                kwq kwqVar = (kwq) obj2;
                klc klcVar = (klc) kwqVar.c;
                return ahno.as(((qrx) klcVar.b).a(iqjVar, klcVar.c), new isv(obj2, i4), kwqVar.a);
            case 1:
                int iOrdinal = ((aimp) obj).ordinal();
                Object obj3 = this.a;
                if (iOrdinal == 0) {
                    return ((kwq) obj3).i();
                }
                if (iOrdinal != 3) {
                    return ahng.n(Boolean.FALSE);
                }
                kwq kwqVar2 = (kwq) obj3;
                Object obj4 = kwqVar2.c;
                klc klcVar2 = (klc) obj4;
                int i7 = klcVar2.a;
                return ahno.as(ahno.ar(i7 != -1 ? ahng.n(Integer.valueOf(i7)) : ahno.ar(((qrx) klcVar2.b).c(), new iii(obj4, 15), klcVar2.c), new iqj(20), klcVar2.c), new isv(obj3, i5), kwqVar2.a);
            case 2:
                return ((kwq) this.a).i();
            case 3:
                return !((File) obj).exists() ? ((itd) this.a).a() : ahng.n(Boolean.FALSE);
            case 4:
                List list = (List) obj;
                if (list.isEmpty()) {
                    return ahng.n(Boolean.TRUE);
                }
                Object obj5 = this.a;
                int size = list.size();
                aihf aihfVarCreateBuilder = anxb.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                anxb anxbVar = (anxb) aihfVarCreateBuilder.instance;
                anxbVar.c = 3;
                anxbVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                anxb anxbVar2 = (anxb) aihfVarCreateBuilder.instance;
                anxbVar2.b |= 4;
                anxbVar2.e = size;
                itd itdVar = (itd) obj5;
                xeu xeuVar = (xeu) itdVar.f.a;
                if (xeuVar.b) {
                    xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.MUSIC_SIDELOADED_PLAYLIST_EXPORT);
                    ztf ztfVar = xffVarA.k.e;
                    xffVarA.l = ztfVar.a();
                    ztfVar.k(xffVarA);
                } else {
                    alos alosVar = (alos) alou.a.createBuilder();
                    alosVar.copyOnWrite();
                    alou alouVar = (alou) alosVar.instance;
                    anxb anxbVar3 = (anxb) aihfVarCreateBuilder.build();
                    anxbVar3.getClass();
                    alouVar.d = anxbVar3;
                    alouVar.c = 347;
                    xeuVar.b((alou) alosVar.build());
                }
                File fileB = itdVar.b();
                if (!fileB.exists() && !fileB.mkdir()) {
                    throw new FileNotFoundException("Cannot create dir:".concat(fileB.toString()));
                }
                if (fileB.exists() && (fileArrListFiles = fileB.listFiles()) != null && (fileArrListFiles.length) != 0) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                itdVar.e.clear();
                List list2 = (List) Collection.EL.stream(list).map(new hph(obj5, fileB, i)).collect(Collectors.toList());
                return ahno.au(list2).k(new itc(obj5, list2, i5), itdVar.c);
            case 5:
                Throwable th = (Throwable) obj;
                ((agrc) ((agrc) ((agrc) itq.a.b().i(agso.a, "SideloadedBrowsePage")).j(th)).k("com/google/android/apps/youtube/music/sideloaded/service/SideloadedBrowsePageGenerationService", "buildSideloadedBrowsePageResponse", 630, "SideloadedBrowsePageGenerationService.java")).w("%s", this.a);
                return ahng.m(th);
            case 6:
                iuf iufVar = (iuf) this.a;
                List<anuk> list3 = (List) obj;
                ((hfn) iufVar.e.io()).aj(3, 2, list3.size());
                ArrayList arrayList = new ArrayList(list3.size());
                for (anuk anukVar : list3) {
                    arrayList.add(iufVar.o.G(ixt.o(Uri.parse(hef.p(anukVar))), ish.h, "is_music=1 AND title IS NOT NULL", null, "play_order").c(afwl.f(new itx(anukVar, i6)), iufVar.c).g());
                }
                return ahng.k(arrayList);
            case 7:
                Object obj6 = this.a;
                iuf iufVar2 = (iuf) obj6;
                return ahno.as(((hfn) iufVar2.g.io()).U(), new gqb(obj6, (Map) obj, i2), iufVar2.c);
            case 8:
                List list4 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list4.size());
                Iterator it = list4.iterator();
                while (true) {
                    Object obj7 = this.a;
                    if (!it.hasNext()) {
                        ListenableFuture listenableFutureK = ahng.k(arrayList2);
                        iuf iufVar3 = (iuf) obj7;
                        ListenableFuture listenableFutureJ = iufVar3.j();
                        return ahno.av(listenableFutureK, listenableFutureJ).k(new itv(obj7, listenableFutureK, listenableFutureJ, 5), iufVar3.c);
                    }
                    anuk anukVar2 = (anuk) it.next();
                    iuf iufVar4 = (iuf) obj7;
                    aheo aheoVarG = iufVar4.o.G(ixt.o(Uri.parse(hef.p(anukVar2))), new String[]{"album_id"}, null, null, "play_order").g();
                    iua iuaVar = new iua(i6);
                    Executor executor = iufVar4.c;
                    arrayList2.add(ahno.ar(ahno.am(aheoVarG, afky.class, iuaVar, executor), new idw(obj7, anukVar2, 14), executor));
                }
                break;
            case 9:
                boolean zEquals = Objects.equals((Boolean) obj, Boolean.TRUE);
                Object obj8 = this.a;
                if (zEquals) {
                    iuf iufVar5 = (iuf) obj8;
                    return ahno.ar(((hfn) iufVar5.g.io()).Y(), new itg(obj8, i), iufVar5.c);
                }
                iuf iufVar6 = (iuf) obj8;
                ahdm ahdmVarG = iufVar6.o.G(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, ish.n, null, null, null);
                ahdf ahdfVarF = afwl.f(new itx(obj8, i4));
                Executor executor2 = iufVar6.c;
                return afxd.f(ahdmVarG.c(ahdfVarF, executor2).g()).b(afky.class, new itg(obj8, i3), executor2);
            case 10:
                return ahng.t((Iterable) Collection.EL.stream((agke) obj).map(new iuk(this.a, i6)).collect(aghu.a));
            case 11:
                agke agkeVar = (agke) obj;
                return agkeVar.isEmpty() ? ahng.n(0) : ((hfn) ((iuf) this.a).g.io()).ac(agkeVar);
            case 12:
                List<anuk> list5 = (List) obj;
                ArrayList arrayList3 = new ArrayList(list5.size());
                for (anuk anukVar3 : list5) {
                    Object obj9 = this.a;
                    iuf iufVar7 = (iuf) obj9;
                    aheo aheoVarG2 = iufVar7.o.G(ixt.o(Uri.parse(hef.p(anukVar3))), new String[]{"audio_id"}, null, null, "play_order").g();
                    ist istVar = new ist(i3);
                    Executor executor3 = iufVar7.c;
                    arrayList3.add(ahno.ar(ahno.am(aheoVarG2, afky.class, istVar, executor3), new idw(obj9, anukVar3, i3), executor3));
                }
                return ahng.k(arrayList3);
            case 13:
                iux iuxVar = (iux) obj;
                if (iuxVar == null) {
                    return ahng.n(null);
                }
                Object obj10 = this.a;
                iuf iufVar8 = (iuf) obj10;
                return ahno.ar(iufVar8.x((agke) Collection.EL.stream(iuxVar.c).map(new itm(10)).collect(aghu.a)), new idw(obj10, iuxVar, i2), iufVar8.c);
            case 14:
                Object obj11 = this.a;
                iuo iuoVar = (iuo) obj11;
                return ahno.as(iuoVar.k.U(), new iub(obj11, (Map) obj, 9), iuoVar.c);
            case 15:
                iux iuxVar2 = (iux) obj;
                iuxVar2.getClass();
                agke agkeVar2 = (agke) Collection.EL.stream(iuxVar2.c).map(new itm(17)).collect(aghu.a);
                Object obj12 = this.a;
                iuo iuoVar2 = (iuo) obj12;
                return ahno.ar(iuoVar2.x(agkeVar2), new kjh(obj12, iuxVar2, i6, bArr), iuoVar2.c);
            case 16:
                return ahng.t((Iterable) Collection.EL.stream((agke) obj).map(new iuk(this.a, i5)).collect(aghu.a));
            case 17:
                agke agkeVar3 = (agke) obj;
                return agkeVar3.isEmpty() ? ahng.n(0) : ((iuo) this.a).k.ac(agkeVar3);
            case 18:
                Optional optionalOfNullable = (Optional) obj;
                hlx hlxVar = new hlx(this.a, 11);
                if (true == optionalOfNullable.isPresent()) {
                    Object obj13 = optionalOfNullable.get();
                    Object obj14 = hlxVar.a;
                    ArrayList arrayList4 = new ArrayList();
                    annv annvVar = (annv) ((weh) obj13);
                    arrayList4.addAll(annvVar.g());
                    arrayList4.addAll(annvVar.j());
                    arrayList4.addAll(annvVar.e());
                    arrayList4.addAll(annvVar.i());
                    optionalOfNullable = Optional.ofNullable(((ixd) obj14).e.m((List) Collection.EL.stream(arrayList4).map(new ixa(i6)).collect(Collectors.toList()), false));
                }
                return (ListenableFuture) optionalOfNullable.orElse(ahng.n(new ArrayList()));
            case 19:
                return xsc.ak();
            default:
                return ((aczl) ((odr) this.a).b.io()).u();
        }
    }
}
