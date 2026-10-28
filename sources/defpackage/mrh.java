package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mrh implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mrh(xte xteVar, String str, Uri uri, int i) {
        this.$cid = i;
        this.c = xteVar;
        this.d = str;
        this.a = "";
        this.b = uri;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0546  */
    /* JADX WARN: Code duplicated, block: B:122:0x054f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0561  */
    /* JADX WARN: Code duplicated, block: B:126:0x0570  */
    /* JADX WARN: Code duplicated, block: B:80:0x03e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ayx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, tgg] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, ror] */
    /* JADX WARN: Type inference failed for: r0v72, types: [acfw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, mbc] */
    /* JADX WARN: Type inference failed for: r1v46, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v66, types: [java.lang.Object, uxi] */
    /* JADX WARN: Type inference failed for: r6v34, types: [java.lang.Object, zsl] */
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
        View childAt;
        int width;
        int width2;
        int i;
        long jD;
        ObjectAnimator duration;
        tnm tnmVar;
        String str;
        int i2 = 7;
        byte[] bArr = null;
        int i3 = 3;
        switch (this.$cid) {
            case 0:
                ?? r0 = this.b;
                Object obj = this.c;
                if (r0 != 0) {
                    ((View) obj).addOnLayoutChangeListener(r0);
                }
                ?? r1 = this.d;
                if (r1 != 0) {
                    Object obj2 = this.a;
                    int i4 = bac.a;
                    View view = (View) obj;
                    azs.c(view, r1);
                    if (((mrl) obj2).j) {
                        view.requestApplyInsets();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Object obj3 = this.c;
                boolean z = obj3 instanceof NestedScrollView;
                if (!z && !(obj3 instanceof HorizontalScrollView)) {
                    throw new nud("ScrollableContainerTypeAutoScrollCommand should only apply to ScrollableContainerTypeinstance");
                }
                Object obj4 = this.a;
                int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
                asoj asojVar = (asoj) obj4;
                long j = 200;
                if ((asojVar.c & 1) != 0) {
                    long j2 = asojVar.d;
                    if (j2 > 0) {
                        j = j2;
                    }
                }
                Object obj5 = this.b;
                Object obj6 = this.d;
                DisplayMetrics displayMetrics = ((Context) obj5).getResources().getDisplayMetrics();
                View view2 = (View) obj3;
                int scrollX = view2.getScrollX();
                int scrollY = view2.getScrollY();
                if (layoutDirectionFromLocale != 1) {
                    childAt = ((ViewGroup) obj3).getChildAt(0);
                    if (z) {
                        width = childAt.getHeight();
                        width2 = view2.getHeight();
                    } else {
                        width = childAt.getWidth();
                        width2 = view2.getWidth();
                    }
                    i = width - width2;
                    jD = (((long) mqm.d(displayMetrics, i)) * 1000) / j;
                    if (z) {
                        duration = ObjectAnimator.ofInt(obj3, "scrollY", scrollY, i).setDuration(jD);
                    } else {
                        duration = ObjectAnimator.ofInt(obj3, "scrollX", scrollX, i).setDuration(jD);
                    }
                    ((mqm) obj6).a = duration;
                } else if (z) {
                    z = true;
                    childAt = ((ViewGroup) obj3).getChildAt(0);
                    if (z) {
                        width = childAt.getHeight();
                        width2 = view2.getHeight();
                    } else {
                        width = childAt.getWidth();
                        width2 = view2.getWidth();
                    }
                    i = width - width2;
                    jD = (((long) mqm.d(displayMetrics, i)) * 1000) / j;
                    if (z) {
                        duration = ObjectAnimator.ofInt(obj3, "scrollY", scrollY, i).setDuration(jD);
                    } else {
                        duration = ObjectAnimator.ofInt(obj3, "scrollX", scrollX, i).setDuration(jD);
                    }
                    ((mqm) obj6).a = duration;
                } else {
                    ((mqm) obj6).a = ObjectAnimator.ofInt(obj3, "scrollX", scrollX, 0).setDuration((((long) mqm.d(displayMetrics, scrollX)) * 1000) / j);
                }
                mqm mqmVar = (mqm) obj6;
                mqmVar.a.addListener(new mql());
                ObjectAnimator objectAnimator = mqmVar.a;
                if (objectAnimator != null) {
                    objectAnimator.start();
                    return;
                }
                return;
            case 2:
                ((axnp) this.c).f((String) this.d, (aqi) this.b, (byte[]) this.a);
                return;
            case 3:
                this.a.execute(new lez(this.c, this.d, this.b, 17, (int[]) null));
                return;
            case 4:
                ((agrc) ((agrc) qkn.a.a((Level) this.d).j((Throwable) this.c)).k("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).I((String) this.b, (Object[]) this.a);
                return;
            case 5:
                Object obj7 = this.c;
                Object obj8 = this.d;
                qyh qyhVar = (qyh) obj8;
                qxn qxnVar = (qxn) obj7;
                qyhVar.l = qxnVar;
                qxy qxyVar = qyhVar.a;
                qxyVar.m = qxnVar;
                Object obj9 = this.b;
                qxyVar.d = ahbt.a(((qvu) obj9).p);
                qxyVar.e = ahbt.a((Duration) this.a);
                qvq qvqVar = (qvq) obj9;
                qxyVar.f = ahbt.a(qvqVar.c);
                agke agkeVar = qyhVar.i;
                qxyVar.g.getClass();
                qxyVar.h = agkeVar;
                qxyVar.j = qvqVar.f;
                qxyVar.k = (float) qvqVar.d;
                qxyVar.i();
                qxyVar.n = new qcb(obj8, bArr);
                qxyVar.I();
                return;
            case 6:
                rmc rmcVar = (rmc) this.b;
                rmcVar.a.getWritableDatabase().delete((String) this.c, (String) this.d, (String[]) this.a);
                rmcVar.b.open();
                return;
            case 7:
                ((rom) this.c).g((aomb) this.a, (rlt) this.b, (aoma) this.d);
                return;
            case 8:
                rlt rltVar = (rlt) this.b;
                String str2 = rltVar.a;
                Object obj10 = this.a;
                xte xteVar = (xte) ((tld) this.d).a;
                ros rosVar = new ros((Context) xteVar.d, (String) obj10, rltVar, (rly) xteVar.b, (wjr) xteVar.a, xteVar.c);
                if (((vxz) xteVar.f).m(14, 45627566L)) {
                    rosVar.B(tok.VERIFY_PARENT_CREDENTIALS_REQUEST);
                }
                try {
                    try {
                        tnx tnxVar = (tnx) xteVar.e.c(rosVar).get();
                        i3 = 5;
                        if (tnxVar.h() && tnxVar.c().a != null) {
                            JSONObject jSONObject = (JSONObject) tnxVar.c().a;
                            jSONObject.getClass();
                            if (true != TextUtils.isEmpty(jSONObject.getString("encodedRapt"))) {
                                i3 = 1;
                            } else {
                                i3 = 2;
                            }
                        }
                        break;
                    } catch (JSONException unused) {
                    }
                } catch (InterruptedException | ExecutionException e) {
                    if ((e.getCause() instanceof tob) && (tnmVar = ((tob) e.getCause()).b) != null && tnmVar.d == 400) {
                        if ("INVALID_GRANT".equals(new JSONObject(new String(tnmVar.e())).getJSONObject("error").getString("message"))) {
                            i3 = 2;
                        }
                    }
                }
                ?? r2 = this.c;
                int i5 = i3 - 1;
                if (i5 == 0) {
                    r2.l();
                    return;
                } else if (i5 != 1) {
                    r2.j();
                    return;
                } else {
                    r2.k();
                    return;
                }
            case 9:
                rlt rltVar2 = (rlt) this.b;
                ((rqa) this.c).d(rltVar2, new rmv(rltVar2.b, (wnq) this.d), (ajwo) this.a);
                return;
            case 10:
                ((rqa) this.d).d((rlt) this.b, (rmv) this.c, (ajwo) this.a);
                return;
            case 11:
                Object obj11 = this.a;
                rux ruxVar = (rux) this.b;
                rsr rsrVar = ruxVar.c;
                String str3 = (String) obj11;
                acfw acfwVarB = rsrVar.b(str3);
                Object obj12 = this.d;
                Object obj13 = this.c;
                wjf wjfVarA = rsrVar.a(str3);
                if (acfwVarB == null || wjfVarA == null) {
                    ruxVar.i.b(str3, ((yvs) obj12).a, abad.NOT_FORWARDED);
                    smd smdVar = (smd) obj13;
                    ruxVar.b.b(smdVar.a, smdVar.b);
                    return;
                }
                spn spnVar = ruxVar.b;
                smd smdVar2 = (smd) obj13;
                String str4 = smdVar2.a;
                String str5 = smdVar2.b;
                spnVar.c(str4, str5);
                rtl rtlVar = ruxVar.h;
                byte[] bArrAb = wjfVarA.ab();
                Iterator it = wjfVarA.H().iterator();
                while (true) {
                    if (it.hasNext()) {
                        aisu aisuVar = (aisu) it.next();
                        int iBi = a.bi(aisuVar.f);
                        if (iBi == 0) {
                            iBi = 1;
                        }
                        if (iBi == 7) {
                            str = aisuVar.g;
                        }
                    } else {
                        rmp.n(null, "Missing BREAK_CUE_POINT in AdBreakRenderer");
                        str = "";
                    }
                }
                yvs yvsVar = (yvs) obj12;
                String str6 = yvsVar.e;
                int i6 = smdVar2.d;
                aazw aazwVar = ruxVar.d;
                long jA = acfwVarB.a();
                long jA2 = acfwVarB.a();
                aazwVar.a();
                String str7 = str;
                axmq axmqVar = new axmq(ruxVar.e, ruxVar.f);
                String str8 = yvsVar.a;
                aigj aigjVar = yvsVar.i;
                if (str6 == null) {
                    str6 = "";
                }
                wgk wgkVarA = rtlVar.a(str3, bArrAb, str7, str6, 0L, jA, i6, jA2, axmqVar, true, Optional.of(str8), false, aigjVar);
                if (wgkVarA != null) {
                    ruxVar.i.b(str3, str8, abad.OK);
                    spnVar.e(str4, str5, wgkVarA);
                    return;
                } else {
                    ruxVar.i.b(str3, str8, abad.SERVER_ERROR);
                    new RuntimeException("Ad break response is null.");
                    spnVar.g(str4, str5);
                    return;
                }
            case 12:
                ((ruz) this.b).f.e((wgk) this.c, (String) this.a, this.d);
                return;
            case 13:
                uiq uiqVar = new uiq((String) this.c, (String) this.d, new uir((String) this.a, new aoh(13)));
                Objects.checkIndex(0, 3);
                aihf aihfVarCreateBuilder = akdd.a.createBuilder();
                alay alayVarC = ackj.c(uiqVar.a);
                aihfVarCreateBuilder.copyOnWrite();
                akdd akddVar = (akdd) aihfVarCreateBuilder.instance;
                alayVarC.getClass();
                akddVar.c = alayVarC;
                akddVar.b |= 1;
                String str9 = uiqVar.b;
                if (str9 != null) {
                    aihfVarCreateBuilder.aR(ackj.d(str9));
                }
                Object obj14 = this.b;
                uir uirVar = uiqVar.c;
                aihf aihfVarCreateBuilder2 = ajng.a.createBuilder();
                aihfVarCreateBuilder2.getClass();
                aihh aihhVar = (aihh) ajnf.a.createBuilder();
                aihhVar.getClass();
                alay alayVarD = ackj.d(uirVar.a);
                alayVarD.getClass();
                aihhVar.copyOnWrite();
                ajnf ajnfVar = (ajnf) aihhVar.instance;
                ajnfVar.m = alayVarD;
                ajnfVar.b |= 64;
                aihhVar.copyOnWrite();
                ajnf ajnfVar2 = (ajnf) aihhVar.instance;
                ajnfVar2.d = 42;
                ajnfVar2.c = 1;
                aihn aihnVarBuild = aihhVar.build();
                aihnVarBuild.getClass();
                aihfVarCreateBuilder2.copyOnWrite();
                ajng ajngVar = (ajng) aihfVarCreateBuilder2.instance;
                ajngVar.c = (ajnf) aihnVarBuild;
                ajngVar.b |= 1;
                aihn aihnVarBuild2 = aihfVarCreateBuilder2.build();
                aihnVarBuild2.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                akdd akddVar2 = (akdd) aihfVarCreateBuilder.instance;
                akddVar2.g = (ajng) aihnVarBuild2;
                akddVar2.b |= 64;
                aihfVarCreateBuilder.getClass();
                uip uipVar = new uip();
                acwu acwuVarA = acwv.a();
                acwuVarA.a = uipVar;
                acwuVarA.d((akdd) aihfVarCreateBuilder.build());
                acwuVarA.b(false);
                ((acwq) ((ulp) obj14).K.a).d(acwuVarA.a());
                return;
            case 14:
                unh unhVar = (unh) this.b;
                umf umfVar = unhVar.A;
                umfVar.m(this.c);
                umfVar.q(new ahgb((augy) ((aihf) this.a).build(), (vbu) this.d));
                unhVar.d.i();
                return;
            case 15:
                Object obj15 = this.b;
                Object obj16 = this.a;
                Object obj17 = this.d;
                Object obj18 = this.c;
                try {
                    byte[] bArrB = agyi.b(((Context) ((xte) obj18).e).getContentResolver().openInputStream((Uri) obj15));
                    int length = bArrB.length;
                    ((xte) obj18).g(new ull(obj18, 8));
                    Object obj19 = ((xte) obj18).b;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
                    taq.c();
                    atzc atzcVar = new atzc();
                    atzcVar.d("X-YouTube-ChannelId", (String) obj16);
                    ((xte) obj18).g(new uqd(obj18, ((ssr) obj19).a((String) obj17, atzcVar, byteArrayInputStream), 0));
                    return;
                } catch (Exception unused2) {
                    ((xte) obj18).g(new ull(obj18, 9));
                    return;
                }
            case 16:
                Object obj20 = this.c;
                Object obj21 = this.d;
                ((ImageView) obj21).setImageDrawable((Drawable) obj20);
                View view3 = (View) obj21;
                Bitmap bitmapFu = yno.fu((Context) this.b, view3);
                vgp vgpVar = ((vgo) this.a).c;
                vgpVar.u = bitmapFu;
                vgpVar.t.setVisibility(8);
                vgpVar.s.addView(view3);
                return;
            case 17:
                utt uttVar = new utt((List) this.a);
                usd usdVar = (usd) this.b;
                usdVar.i(uttVar);
                ((vfs) this.c).b(usdVar.c());
                ((vhu) this.d).d = true;
                return;
            case 18:
                ((vlr) this.b).b(new bi((aunn) this.a, (CommandOuterClass$Command) this.d, (nrv) this.c, 6));
                return;
            case 19:
                ((vlr) this.b).b(new bi((aunn) this.a, (CommandOuterClass$Command) this.d, (nrv) this.c, i2));
                return;
            default:
                Object obj22 = ((afwv) this.d).c;
                ((vpt) obj22).m((FrameLayout) this.c, (RecyclerView) this.b);
                ((vqg) obj22).t((apoq) this.a);
                return;
        }
    }

    public /* synthetic */ mrh(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ mrh(Object obj, Object obj2, Object obj3, Object obj4, int i, char[] cArr) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
        this.d = obj4;
    }

    public /* synthetic */ mrh(Object obj, Object obj2, Object obj3, Object obj4, int i, short[] sArr) {
        this.$cid = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.a = obj4;
    }

    public /* synthetic */ mrh(Object obj, String str, String str2, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = str;
        this.d = str2;
        this.a = obj2;
    }

    public /* synthetic */ mrh(mqm mqmVar, asoj asojVar, View view, Context context, int i) {
        this.$cid = i;
        this.d = mqmVar;
        this.a = asojVar;
        this.c = view;
        this.b = context;
    }

    public /* synthetic */ mrh(mrl mrlVar, View.OnLayoutChangeListener onLayoutChangeListener, View view, ayx ayxVar, int i) {
        this.$cid = i;
        this.a = mrlVar;
        this.b = onLayoutChangeListener;
        this.c = view;
        this.d = ayxVar;
    }

    public /* synthetic */ mrh(rom romVar, aomb aombVar, rlt rltVar, aoma aomaVar, int i) {
        this.$cid = i;
        this.c = romVar;
        this.a = aombVar;
        this.b = rltVar;
        this.d = aomaVar;
    }

    public /* synthetic */ mrh(rqa rqaVar, rlt rltVar, rmv rmvVar, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.d = rqaVar;
        this.b = rltVar;
        this.c = rmvVar;
        this.a = ajwoVar;
    }

    public /* synthetic */ mrh(rqa rqaVar, rlt rltVar, wnq wnqVar, ajwo ajwoVar, int i) {
        this.$cid = i;
        this.c = rqaVar;
        this.b = rltVar;
        this.d = wnqVar;
        this.a = ajwoVar;
    }

    public /* synthetic */ mrh(tld tldVar, ror rorVar, String str, rlt rltVar, int i) {
        this.$cid = i;
        this.d = tldVar;
        this.c = rorVar;
        this.a = str;
        this.b = rltVar;
    }

    public /* synthetic */ mrh(usd usdVar, List list, vfs vfsVar, vhu vhuVar, int i) {
        this.$cid = i;
        this.b = usdVar;
        this.a = list;
        this.c = vfsVar;
        this.d = vhuVar;
    }

    public /* synthetic */ mrh(vgo vgoVar, ImageView imageView, Drawable drawable, Context context, int i) {
        this.$cid = i;
        this.a = vgoVar;
        this.d = imageView;
        this.c = drawable;
        this.b = context;
    }

    public /* synthetic */ mrh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$cid = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
        this.a = obj4;
    }
}
