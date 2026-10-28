package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iub implements ahcy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iub(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ahcy
    public final ListenableFuture a(Object obj) {
        aifv aifvVar;
        long jF;
        int i = 19;
        int i2 = 16;
        int i3 = 12;
        int i4 = 15;
        int i5 = 2;
        byte[] bArr = null;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                return ((iuf) this.a).z((ahdm) this.b, (Map) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return ahng.n(null);
                }
                Object obj2 = this.a;
                if (!iuf.R()) {
                    return ahng.n(uri);
                }
                Object obj3 = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("name", (String) obj3);
                iuf iufVar = (iuf) obj2;
                return ahno.ar(iufVar.o.J(uri, contentValues, null, null), new itg(uri, 14), iufVar.c);
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj4 = this.a;
                Object obj5 = this.b;
                Uri uri2 = (Uri) obj4;
                if (iuf.O(uri2)) {
                    return ((hfn) ((iuf) obj5).g.io()).T(iuf.b(uri2));
                }
                iuf iufVar2 = (iuf) obj5;
                return ahno.ar(iufVar2.o.K(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{uri2.getLastPathSegment()}), new ist(8), iufVar2.c);
            case 3:
                boolean zEquals = Objects.equals((Boolean) obj, Boolean.TRUE);
                Object obj6 = this.b;
                Object obj7 = this.a;
                if (zEquals) {
                    iuf iufVar3 = (iuf) obj7;
                    return ahno.ar(((hfn) iufVar3.g.io()).S((String) obj6), new iua(7), iufVar3.c);
                }
                ContentValues contentValues2 = new ContentValues();
                if (iuf.R()) {
                    contentValues2.put("name", ((String) obj6) + '_' + ((iuf) obj7).k.f().toEpochMilli());
                } else {
                    contentValues2.put("name", (String) obj6);
                }
                iuf iufVar4 = (iuf) obj7;
                contentValues2.put("date_added", Long.valueOf(iufVar4.a()));
                contentValues2.put("date_modified", Long.valueOf(iufVar4.a()));
                ListenableFuture listenableFutureI = iufVar4.o.I(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues2);
                iub iubVar = new iub(obj7, obj6, i6);
                Executor executor = iufVar4.c;
                return afxd.f(ahno.as(listenableFutureI, iubVar, executor)).b(afky.class, new ist(i3), executor);
            case 4:
                Cursor cursor = (Cursor) obj;
                ArrayList arrayList = new ArrayList();
                if (cursor != null) {
                    try {
                        int columnIndex = cursor.getColumnIndex("audio_id");
                        while (cursor.moveToNext()) {
                            arrayList.add(Long.valueOf(cursor.getLong(columnIndex)));
                        }
                        jku.b(cursor);
                    } catch (Throwable th) {
                        jku.b(cursor);
                        throw th;
                    }
                }
                Object obj8 = this.a;
                Object obj9 = this.b;
                iuf iufVar5 = (iuf) obj9;
                return ahno.as(iufVar5.t((Uri) obj8), new hlk(obj9, arrayList, obj8, 8, null), iufVar5.d);
            case 5:
                return Objects.equals((Boolean) obj, Boolean.TRUE) ? ((iuo) this.a).k.ac((agke) this.b) : ahng.n(0);
            case 6:
                return ((iuo) this.b).k.R(iuo.j((Uri) this.a), (agke) obj);
            case 7:
                return ((iuo) this.a).E(this.b, (Map) obj);
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(Boolean.FALSE);
                }
                Object obj10 = this.a;
                Object obj11 = this.b;
                Uri uri3 = (Uri) obj10;
                if (iuo.P(uri3)) {
                    return ((iuo) obj11).k.T(iuo.j(uri3));
                }
                iuo iuoVar = (iuo) obj11;
                return ahno.ar(ahno.ap(new itc(iuoVar, obj10, i2), iuoVar.d), new iua(i), iuoVar.c);
            case 9:
                return ahng.t((Iterable) Collection.EL.stream((agke) obj).map(new hph(this.a, this.b, 11)).collect(aghu.a));
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    return ahng.n(null);
                }
                Object obj12 = this.b;
                Object obj13 = this.a;
                iuo iuoVar2 = (iuo) obj13;
                return ahno.as(iuoVar2.H(), new iub(obj13, obj12, i3), iuoVar2.c);
            case 11:
                return ((iuo) this.b).k.R(iuo.j((Uri) this.a), (agke) obj);
            case 12:
                boolean zEquals2 = Objects.equals((Boolean) obj, Boolean.TRUE);
                Object obj14 = this.b;
                Object obj15 = this.a;
                if (zEquals2) {
                    iuo iuoVar3 = (iuo) obj15;
                    return ahno.ar(iuoVar3.k.S((String) obj14), new iua(i4), iuoVar3.c);
                }
                ContentValues contentValues3 = new ContentValues();
                if (iuo.S()) {
                    contentValues3.put("name", ((String) obj14) + '_' + Instant.now().toEpochMilli());
                } else {
                    contentValues3.put("name", (String) obj14);
                }
                contentValues3.put("date_added", Long.valueOf(iuo.b()));
                contentValues3.put("date_modified", Long.valueOf(iuo.b()));
                iuo iuoVar4 = (iuo) obj15;
                ListenableFuture listenableFutureAp = ahno.ap(new itc(iuoVar4, (Object) contentValues3, i4), iuoVar4.d);
                return ahno.av(listenableFutureAp).k(new itv(obj15, listenableFutureAp, obj14, 17), iuoVar4.c);
            case 13:
                final agag agagVar = (agag) obj;
                if (agagVar != null) {
                    Object obj16 = this.b;
                    final jnw jnwVar = (jnw) this.a;
                    final String str = (String) obj16;
                    if (!jnwVar.g(str)) {
                        return afxd.f(((hpy) jnwVar.e.io()).a(kro.aH(str))).g(new agek() { // from class: jnv
                            /* JADX WARN: Code duplicated, block: B:10:0x0033  */
                            @Override // defpackage.agek
                            public final Object apply(Object obj17) {
                                String str2;
                                jnw jnwVar2 = jnwVar;
                                cf cfVar = jnwVar2.b;
                                Optional optional = (Optional) obj17;
                                String string = cfVar.getString(R.string.accessibility_like_video);
                                anzw musicVideoType = jnwVar2.h;
                                if (optional.isPresent()) {
                                    Object obj18 = optional.get();
                                    if (obj18 instanceof anyx) {
                                        anyx anyxVar = (anyx) obj18;
                                        if (musicVideoType == anzw.MUSIC_VIDEO_TYPE_UNKNOWN) {
                                            musicVideoType = anyxVar.getMusicVideoType();
                                        }
                                        String likesCountText = anyxVar.getLikesCountText();
                                        String likesCountAccessibilityText = anyxVar.getLikesCountAccessibilityText();
                                        str2 = likesCountText;
                                        string = likesCountAccessibilityText;
                                    } else {
                                        str2 = "";
                                    }
                                } else {
                                    str2 = "";
                                }
                                String str3 = str;
                                boolean zIsPresent = optional.isPresent();
                                aihf aihfVarCreateBuilder = aser.a.createBuilder();
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar = (aser) aihfVarCreateBuilder.instance;
                                str3.getClass();
                                aserVar.b |= 1;
                                aserVar.c = str3;
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar2 = (aser) aihfVarCreateBuilder.instance;
                                string.getClass();
                                aserVar2.b |= 4;
                                aserVar2.e = string;
                                String string2 = cfVar.getString(R.string.accessibility_dislike_video);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar3 = (aser) aihfVarCreateBuilder.instance;
                                string2.getClass();
                                aserVar3.b |= 8;
                                aserVar3.f = string2;
                                String string3 = cfVar.getString(R.string.save);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar4 = (aser) aihfVarCreateBuilder.instance;
                                string3.getClass();
                                aserVar4.b |= 16;
                                aserVar4.g = string3;
                                String string4 = cfVar.getString(R.string.save_to_playlist);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar5 = (aser) aihfVarCreateBuilder.instance;
                                string4.getClass();
                                aserVar5.b |= 32;
                                aserVar5.h = string4;
                                String string5 = cfVar.getString(R.string.share);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar6 = (aser) aihfVarCreateBuilder.instance;
                                string5.getClass();
                                aserVar6.b |= 64;
                                aserVar6.i = string5;
                                String string6 = cfVar.getString(R.string.share);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar7 = (aser) aihfVarCreateBuilder.instance;
                                string6.getClass();
                                aserVar7.b |= SemanticState.Focused;
                                aserVar7.j = string6;
                                String string7 = cfVar.getString(R.string.lyrics_tab_title);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar8 = (aser) aihfVarCreateBuilder.instance;
                                string7.getClass();
                                aserVar8.b |= SemanticState.Hidden;
                                aserVar8.k = string7;
                                String string8 = cfVar.getString(R.string.lyrics_tab_title);
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar9 = (aser) aihfVarCreateBuilder.instance;
                                string8.getClass();
                                aserVar9.b |= SemanticState.LiveRegion;
                                aserVar9.l = string8;
                                aihfVarCreateBuilder.copyOnWrite();
                                aser aserVar10 = (aser) aihfVarCreateBuilder.instance;
                                aserVar10.m = musicVideoType.k;
                                aserVar10.b |= SemanticState.Modal;
                                if (!TextUtils.isEmpty(str2)) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aser aserVar11 = (aser) aihfVarCreateBuilder.instance;
                                    str2.getClass();
                                    aserVar11.b |= 2;
                                    aserVar11.d = str2;
                                }
                                if (!zIsPresent) {
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aser aserVar12 = (aser) aihfVarCreateBuilder.instance;
                                    aserVar12.b |= SemanticState.Obscured;
                                    aserVar12.n = true;
                                    String string9 = cfVar.getString(R.string.lyrics_not_available_at_this_time);
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aser aserVar13 = (aser) aihfVarCreateBuilder.instance;
                                    string9.getClass();
                                    aserVar13.b |= SemanticState.Multiline;
                                    aserVar13.o = string9;
                                }
                                agag agagVar2 = agagVar;
                                aser aserVar14 = (aser) aihfVarCreateBuilder.build();
                                InstanceProxy instanceProxyD = agagVar2.d();
                                if (instanceProxyD instanceof agah) {
                                    agcv agcvVar = ((agah) instanceProxyD).a;
                                }
                                asfp asfpVar = asfp.a;
                                return Optional.of((asfp) agagVar2.f(846667105, aserVar14, aihn.getParserForClass(asfp.class)));
                            }
                        }, jnwVar.d);
                    }
                }
                return ahng.n(Optional.empty());
            case 14:
                okh okhVar = (okh) obj;
                int iB = okhVar.b() - 1;
                if (iB == 1) {
                    return okhVar.c();
                }
                if (iB == 2) {
                    return ahng.n(okhVar.a());
                }
                Object obj17 = this.a;
                Object obj18 = this.b;
                aihf aihfVarCreateBuilder = oiw.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar = (oiw) aihfVarCreateBuilder.instance;
                oih oihVar = (oih) obj17;
                String str2 = oihVar.a;
                str2.getClass();
                oiwVar.b |= 1;
                oiwVar.c = str2;
                zpw zpwVar = (zpw) obj18;
                String packageName = ((Context) zpwVar.n).getPackageName();
                aihfVarCreateBuilder.copyOnWrite();
                oiw oiwVar2 = (oiw) aihfVarCreateBuilder.instance;
                packageName.getClass();
                oiwVar2.b |= 2;
                oiwVar2.d = packageName;
                oiw oiwVar3 = (oiw) aihfVarCreateBuilder.build();
                agev agevVar = oihVar.e;
                agevVar.g();
                agevVar.c();
                ((ooe) ((agfa) zpwVar.l).a).i(str2);
                try {
                    agev agevVar2 = ((oih) obj17).d;
                    agevVar2.g();
                    agev agevVarI = agev.i((oir) aihn.parseFrom(oir.a, ((aifs) agevVar2.c()).toByteArray(), ExtensionRegistryLite.a));
                    oka okaVarA = oka.a(oihVar.a);
                    ahev ahevVar = new ahev(new fxv(3));
                    ooi ooiVarD = ooi.d(ahevVar);
                    ojk ojkVar = new ojk(obj18, oiwVar3, agevVarI, i5);
                    ?? r0 = zpwVar.o;
                    ooi ooiVarE = ooiVarD.f(ojkVar, r0).f(new iub(obj18, obj17, i2, bArr), r0).e(new kke(15), r0);
                    ooi ooiVarF = ooi.d(((syn) zpwVar.h).p(okaVarA.a, ooiVarE)).f(new iub(ahevVar, ooiVarE, 18, bArr), r0);
                    ooi ooiVarF2 = ooiVarF.f(new iub(obj18, okaVarA, i), r0).f(new iaj(obj18, ooiVarF, obj17, str2, 6), r0);
                    ahno.at(ooiVarF2, new ilm(zpwVar, oihVar, str2, okaVarA, 2), r0);
                    return ooiVarF2;
                } catch (aiik e) {
                    return ahng.m(e);
                }
            case 15:
                zpw zpwVar2 = (zpw) this.b;
                return ahno.ar(((olp) zpwVar2.j).d((oiw) this.a, true), new iun((oip) obj, 13), zpwVar2.o);
            case 16:
                oip oipVar = (oip) obj;
                agev agevVarH = zpw.h(oipVar);
                boolean z = ((oih) this.a).f;
                zpw zpwVar3 = (zpw) this.b;
                return zpw.k(oipVar, agevVarH, null, 2, z, (olp) zpwVar3.j, zpwVar3.o, (ayq) zpwVar3.b);
            case 17:
                agkj agkjVar = (agkj) obj;
                for (oin oinVar : this.b) {
                    String str3 = oinVar.c;
                    long j = oinVar.e;
                    long j2 = oinVar.j;
                    if ((oinVar.b & SemanticState.Multiline) != 0) {
                        aifv aifvVar2 = oinVar.q;
                        if (aifvVar2 == null) {
                            aifvVar2 = aifv.a;
                        }
                        aifvVar = aifvVar2;
                    } else {
                        aifvVar = null;
                    }
                    ((aihf) this.a).S(zpw.c(str3, j, j2, null, aifvVar, agkjVar.containsKey(oinVar) && agkjVar.get(oinVar) == oiv.DOWNLOAD_COMPLETE, oinVar.g));
                }
                return aher.a;
            case 18:
                ((ahev) this.b).run();
                return this.a;
            case 19:
                return ((syn) ((zpw) this.a).h).r(((oka) this.b).a);
            default:
                oip oipVar2 = (oip) obj;
                Object obj19 = this.a;
                if (oipVar2 == null || !xgg.u((oip) obj19, oipVar2)) {
                    jF = ((omj) ((xgg) this.b).i).f();
                } else {
                    oio oioVar = oipVar2.c;
                    if (oioVar == null) {
                        oioVar = oio.a;
                    }
                    jF = oioVar.d;
                }
                oio oioVar2 = ((oip) obj19).c;
                if (oioVar2 == null) {
                    oioVar2 = oio.a;
                }
                aihf builder = oioVar2.toBuilder();
                builder.copyOnWrite();
                oio oioVar3 = (oio) builder.instance;
                oioVar3.b |= 2;
                oioVar3.d = jF;
                oio oioVar4 = (oio) builder.build();
                aihf builder2 = ((aihn) obj19).toBuilder();
                builder2.copyOnWrite();
                oip oipVar3 = (oip) builder2.instance;
                oioVar4.getClass();
                oipVar3.c = oioVar4;
                oipVar3.b |= 1;
                return ahng.n((oip) builder2.build());
        }
    }

    public /* synthetic */ iub(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
