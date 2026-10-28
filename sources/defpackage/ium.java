package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import com.google.protos.youtube.api.innertube.InnertubeGetAssetService$GetAssetResponse;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ium implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ium(Object obj, ListenableFuture listenableFuture, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = listenableFuture;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, qpn] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v52, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v55, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, spr] */
    /* JADX WARN: Type inference failed for: r1v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [axso, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = 4;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                if (((Integer) ahng.v(this.b)).intValue() > 0) {
                    ((iuo) this.a).O((Uri) this.c, iuo.b());
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Cursor cursor = (Cursor) ahng.v(this.b);
                ArrayList arrayList = new ArrayList(cursor.getCount());
                try {
                    int columnIndex = cursor.getColumnIndex("audio_id");
                    while (cursor.moveToNext()) {
                        arrayList.add(Long.valueOf(cursor.getLong(columnIndex)));
                    }
                    Object obj = this.c;
                    Object obj2 = this.a;
                    jku.b(cursor);
                    iuo iuoVar = (iuo) obj2;
                    Uri uri = (Uri) obj;
                    int iA = iuoVar.a(uri);
                    ContentValues[] contentValuesArr = new ContentValues[arrayList.size()];
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ContentValues contentValues = new ContentValues();
                        contentValuesArr[i2] = contentValues;
                        contentValues.put("audio_id", (Long) arrayList.get(i2));
                        iA++;
                        contentValuesArr[i2].put("play_order", Integer.valueOf(iA));
                    }
                    return Integer.valueOf(iuoVar.e.bulkInsert(ixt.o(uri), contentValuesArr));
                } catch (Throwable th) {
                    jku.b(cursor);
                    throw th;
                }
            case 2:
                Cursor cursor2 = (Cursor) ahng.v(this.a);
                Map map = (Map) ahng.v(this.b);
                iuo iuoVar2 = (iuo) this.c;
                ((wbz) iuoVar2.f.io()).c();
                jkm jkmVar = new jkm(cursor2, new ism(iuoVar2.b, map, iuoVar2.i.l(263, 45828915L, false)));
                try {
                    return agke.o(jkmVar);
                } finally {
                    jku.b(jkmVar);
                }
            case 3:
                return (Void) mda.n(((lmm) ((lkk) this.b).a.io()).d((Uri) this.c, (Uri) this.a));
            case 4:
                mqj mqjVar = (mqj) this.c;
                nry nryVar = (nry) mqjVar.b.io();
                asoa asoaVar = (asoa) this.b;
                if ((asoaVar.c & 1) != 0 && !asoaVar.d.isEmpty() && mqjVar.a.contains(asoaVar.d)) {
                    return avlb.e();
                }
                mqjVar.a.insert(asoaVar.d);
                CommandOuterClass$Command defaultInstance = asoaVar.e;
                if (defaultInstance == null) {
                    defaultInstance = CommandOuterClass$Command.getDefaultInstance();
                }
                return nryVar.c(defaultInstance, (nrv) this.a, 1);
            case 5:
                atkm atkmVar = (atkm) ((mew) this.c).d(atkm.d);
                if (atkmVar == null) {
                    return avlb.m(new IllegalArgumentException("PerformOnceCommand extension missing."));
                }
                if (atkmVar.f == null) {
                    if ((Memory.peekByte(atkmVar.c + 8) & 1) != 0) {
                        atkmVar.f = atkmVar.cq(atko.e.b);
                    } else {
                        atkmVar.f = "";
                    }
                }
                Object obj3 = this.a;
                String str = atkmVar.f;
                if ((Memory.peekByte(atkmVar.c + 8) & 1) != 0 && !str.isEmpty() && ((mqj) obj3).a.contains(str)) {
                    return avlb.e();
                }
                mqj mqjVar2 = (mqj) obj3;
                mqjVar2.a.insert(str);
                nry nryVar2 = (nry) mqjVar2.b.io();
                if (atkmVar.g == null && (Memory.peekByte(atkmVar.c + 8) & 2) != 0) {
                    atkmVar.g = new mew(atkmVar.cp(true != atko.a ? 12 : 32, atcm.a));
                }
                mew mewVar = atkmVar.g == null ? atcl.a : atkmVar.g;
                if (mewVar == null) {
                    return avlb.e();
                }
                avlb avlbVarE = nryVar2.e(mewVar, (nrv) this.b, 1);
                return avlbVarE == null ? avlb.e() : avlbVarE;
            case 6:
                int i3 = mqq.e;
                Object obj4 = this.b;
                Object obj5 = this.a;
                Object obj6 = this.c;
                if (obj4 instanceof nwg) {
                    return ((nwg) obj4).d((mew) obj6, ((nrv) obj5).f());
                }
                return obj4 instanceof nrw ? ((nrw) obj4).e((mew) obj6, (nrv) obj5) : avlb.m(new Error("Unknown extensionHandler type"));
            case 7:
                aczl aczlVar = (aczl) this.a;
                aamo aamoVarA = ((kwv) aczlVar.d).a();
                if (aamoVarA == null) {
                    ((omj) aczlVar.g).j(15004);
                    return "";
                }
                String strL = aamoVarA.l((Context) this.c, (String) this.b, null, null);
                if (strL != null) {
                    return strL;
                }
                ((omj) aczlVar.g).j(15008);
                return "";
            case 8:
                ((ahgb) ((xsc) this.a).b).L((obp) this.c, null, (byte[]) this.b);
                break;
            case 9:
                String str2 = ((ojb) ahng.v(this.a)).c;
                oiq oiqVar = (oiq) ahng.v(this.b);
                if (oiqVar != null) {
                    return nsm.b(str2, oiqVar.e);
                }
                oin oinVar = (oin) this.c;
                return (oinVar.b & 32) != 0 ? nsm.b(str2, oinVar.i) : str2;
            case 10:
                Object obj7 = this.c;
                HashMap map2 = (HashMap) ((aesp) this.a).c;
                if (map2.containsKey(obj7)) {
                    return (ListenableFuture) map2.get(obj7);
                }
                Object obj8 = this.b;
                map2.put(obj7, obj8);
                return obj8;
            case 11:
                return ((omm) this.c).r((plx) this.a, (String[]) this.b);
            case 12:
                tld tldVar = new tld();
                tldVar.A("reference");
                tldVar.B("& ? = 0", 1L);
                return ((pfv) ((omm) this.c).a).a((plx) this.a, pfx.d(tldVar.z(), "thread_id", (String[]) this.b));
            case 13:
                return ((ayq) ((tld) this.a).b).X((Uri) this.c, this.b);
            case 14:
                ((qsi) this.c).a.execSQL((String) this.a, (Object[]) this.b);
                break;
            case 15:
                rrq rrqVar = (rrq) this.c;
                xff xffVarA = ((xeu) rrqVar.c).a(rrqVar.a(this.a, this.b), alot.APPLICATION_STARTED);
                ztf ztfVar = xffVarA.k.e;
                xffVarA.l = ztfVar.a();
                ztfVar.k(xffVarA);
                return Boolean.TRUE;
            case 16:
                Optional optional = (Optional) ahng.v(this.a);
                ?? r1 = this.c;
                String strF = r1.f(optional);
                ?? r13 = this.b;
                String strI = r1.i();
                String str3 = (String) ahng.v(r13);
                aihf aihfVarCreateBuilder = aloi.a.createBuilder();
                aihf aihfVarCreateBuilder2 = amgu.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                amgu amguVar = (amgu) aihfVarCreateBuilder2.instance;
                amguVar.b |= 1;
                amguVar.e = strI;
                aihfVarCreateBuilder2.copyOnWrite();
                amgu amguVar2 = (amgu) aihfVarCreateBuilder2.instance;
                str3.getClass();
                amguVar2.c = 2;
                amguVar2.d = str3;
                aihfVarCreateBuilder.br(aihfVarCreateBuilder2);
                aihfVarCreateBuilder.copyOnWrite();
                aloi aloiVar = (aloi) aihfVarCreateBuilder.instance;
                aloiVar.b |= 16;
                aloiVar.d = strF;
                boolean zK = r1.k(optional);
                aihfVarCreateBuilder.copyOnWrite();
                aloi aloiVar2 = (aloi) aihfVarCreateBuilder.instance;
                aloiVar2.b |= 64;
                aloiVar2.f = zK;
                boolean zEquals = strF.equals("00000000-0000-0000-0000-000000000000");
                aihfVarCreateBuilder.copyOnWrite();
                aloi aloiVar3 = (aloi) aihfVarCreateBuilder.instance;
                aloiVar3.e = (true != zEquals ? 6 : 1) - 1;
                aloiVar3.b |= 32;
                Optional optionalC = r1.c();
                hkp hkpVar = new hkp(aihfVarCreateBuilder, 8);
                if (true == optionalC.isPresent()) {
                    Object obj9 = optionalC.get();
                    aihf aihfVar = (aihf) hkpVar.a;
                    aihfVar.copyOnWrite();
                    aloi aloiVar4 = (aloi) aihfVar.instance;
                    aloiVar4.b |= SemanticState.Focused;
                    aloiVar4.g = (String) obj9;
                }
                aihf aihfVarCreateBuilder3 = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.instance;
                aloi aloiVar5 = (aloi) aihfVarCreateBuilder.build();
                aloiVar5.getClass();
                innertubeContext$InnerTubeContext.i = aloiVar5;
                innertubeContext$InnerTubeContext.b |= SemanticState.Hidden;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder3.build();
            case 17:
                return (agkz) Collection.EL.stream(this.b).filter(new iab(this.c, this.a, i)).collect(aghu.b);
            case 18:
                InnertubeGetAssetService$GetAssetResponse innertubeGetAssetService$GetAssetResponse = (InnertubeGetAssetService$GetAssetResponse) ahng.v(this.a);
                List list = (List) ahng.v(this.b);
                agke agkeVar = ((uzz) this.c).e;
                ahno.O(agkeVar.size() == list.size());
                agkh agkhVar = new agkh(4);
                for (int i4 = 0; i4 < agkeVar.size(); i4++) {
                    agkhVar.e((ajgi) agkeVar.get(i4), (vay) list.get(i4));
                }
                return new vbh(innertubeGetAssetService$GetAssetResponse, agkhVar.d(false));
            case 19:
                Object obj10 = this.c;
                Bitmap bitmap = (Bitmap) obj10;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                ukh ukhVar = (ukh) this.a;
                Rect rect = new Rect((int) (width * ukhVar.a), (int) (height * ukhVar.b), (int) (width2 * (1.0f - ukhVar.c)), (int) (height2 * (1.0f - ukhVar.d)));
                int iWidth = rect.width();
                int iHeight = rect.height();
                Object obj11 = this.b;
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((Bitmap) obj10, rect.left, rect.top, iWidth, iHeight);
                    if (((vfb) obj11).y() && bitmapCreateBitmap != obj10) {
                        ((Bitmap) obj10).recycle();
                        break;
                    }
                    return bitmapCreateBitmap;
                } catch (IllegalArgumentException e) {
                    ((agrc) ((agrc) ((agrc) vfb.a.b()).j(e)).k("com/google/android/libraries/youtube/creation/projectstate/ImageProjectState", "cropBitmap", (char) 730, "ImageProjectState.java")).t("Illegal arguments for cropping the image");
                    return obj10;
                }
            default:
                final voz vozVar = (voz) this.c;
                boolean zM = vozVar.r.m(25, 45689881L);
                tth tthVar = vozVar.n;
                avlr avlrVar = vozVar.c;
                ?? r4 = this.a;
                return avlh.h(vozVar.b.m, tzk.X(avlrVar, (avlh) r4, tthVar, zM), ((avlr) this.b).g(avla.e), r4, new vth(1)).x(new sqj(9)).ak(new avni() { // from class: voy
                    @Override // defpackage.avni
                    public final void a(Object obj12) {
                        vpc vpcVar;
                        int iA2;
                        vvl vvlVar = (vvl) obj12;
                        int iWidth2 = vvlVar.d.width();
                        int iR = ((vob) vvlVar.c.c()).R();
                        voz vozVar2 = vozVar;
                        Context context = vozVar2.d;
                        boolean zF = vpo.f(context, iWidth2, iR, vozVar2.a);
                        boolean z2 = vvlVar.a;
                        boolean z3 = vvlVar.b;
                        if (vozVar2.g == null || vozVar2.l == null || (vpcVar = vozVar2.f) == null) {
                            return;
                        }
                        agev agevVarD = vpcVar.d();
                        vozVar2.f.c();
                        vozVar2.t.l(6, 45650612L, false);
                        if (!z2 || !agevVarD.g()) {
                            vozVar2.g.setVisibility(8);
                            if (vozVar2.s.l(15, 45400573L, false)) {
                                vozVar2.l.removeAllViews();
                                return;
                            }
                            return;
                        }
                        vozVar2.g.setVisibility(0);
                        vob vobVar = ((vot) agevVarD.c()).b;
                        boolean zE = vpo.e(vobVar);
                        FrameLayout frameLayout = vozVar2.h;
                        if (frameLayout != null) {
                            frameLayout.setVisibility(true != zE ? 0 : 8);
                        }
                        vpo.a(vozVar2.h, vobVar.T());
                        vny vnyVarT = vobVar.T();
                        if (vnyVarT != null) {
                            tuk.l(vozVar2.i, vnyVarT.p() && !zE);
                            agev agevVarE = vozVar2.f.e();
                            vnyVarT.i(agevVarE.g() && ((xsc) agevVarE.c()).h() > 1);
                        }
                        vozVar2.l.removeAllViews();
                        vpo.b(vozVar2.l, vobVar.c());
                        if (vozVar2.q.l(244, 45711405L, false)) {
                            if (vobVar.Q() == 3) {
                                View view = vozVar2.j;
                                if (view != null) {
                                    view.getBackground().setAlpha(0);
                                }
                                View view2 = vozVar2.k;
                                if (view2 != null) {
                                    view2.getBackground().setAlpha(0);
                                }
                                RelativeLayout relativeLayout = vozVar2.g;
                                if (relativeLayout != null) {
                                    View viewFindViewById = relativeLayout.findViewById(R.id.panel_content_touch_wrapper);
                                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewFindViewById.getLayoutParams();
                                    if (layoutParams != null) {
                                        layoutParams.removeRule(3);
                                        viewFindViewById.setLayoutParams(layoutParams);
                                    }
                                }
                            } else {
                                View view3 = vozVar2.j;
                                if (view3 != null) {
                                    view3.getBackground().setAlpha(255);
                                }
                                View view4 = vozVar2.k;
                                if (view4 != null) {
                                    view4.getBackground().setAlpha(255);
                                }
                                RelativeLayout relativeLayout2 = vozVar2.g;
                                if (relativeLayout2 != null) {
                                    View viewFindViewById2 = relativeLayout2.findViewById(R.id.panel_content_touch_wrapper);
                                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewFindViewById2.getLayoutParams();
                                    if (layoutParams2 != null) {
                                        layoutParams2.addRule(3, R.id.header_container);
                                        viewFindViewById2.setLayoutParams(layoutParams2);
                                    }
                                }
                            }
                        }
                        vun vunVarF = vozVar2.v.F(vobVar.G(context.getResources().getConfiguration().orientation), vobVar.r());
                        vun vunVar = vun.e;
                        if (vunVarF == vunVar) {
                            vozVar2.g.setBackgroundColor(0);
                        } else {
                            vozVar2.g.setBackgroundColor(vozVar2.m);
                        }
                        RelativeLayout relativeLayout3 = vozVar2.g;
                        View viewC = vobVar.c();
                        if (vozVar2.s.l(26, 45418396L, false) || vunVarF == vunVar) {
                            int iOrdinal = vunVarF.ordinal();
                            if (iOrdinal == 2) {
                                iA2 = vozVar2.e.a();
                            } else if (iOrdinal == 3) {
                                iA2 = relativeLayout3.getBottom();
                            } else if (iOrdinal != 4) {
                                iA2 = 0;
                            } else {
                                View viewFindViewById3 = viewC.findViewById(R.id.engagement_panel_content);
                                FrameLayout frameLayout2 = vozVar2.h;
                                iA2 = relativeLayout3.getBottom() - (viewFindViewById3.getHeight() + (frameLayout2 == null ? 0 : frameLayout2.getResources().getDimensionPixelSize(R.dimen.panel_header_non_content_height) + vozVar2.h.getHeight()));
                            }
                            View view5 = vozVar2.j;
                            view5.getClass();
                            tym.h(view5, new tyj(iA2, 2), ViewGroup.MarginLayoutParams.class);
                        }
                        vpo.g(context, vobVar.G(context.getResources().getConfiguration().orientation), z3, true, zF, vozVar2.j, vozVar2.l, vozVar2.o, vozVar2.p.l(237, 45828593L, false) && vobVar.S() == 2);
                    }
                });
        }
        return null;
    }

    public /* synthetic */ ium(Object obj, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ium(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ ium(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ ium(mqj mqjVar, asoa asoaVar, nrv nrvVar, int i) {
        this.$cid = i;
        this.c = mqjVar;
        this.b = asoaVar;
        this.a = nrvVar;
    }
}
