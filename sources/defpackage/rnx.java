package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.common.ui.CreationButtonView;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rnx implements View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ rnx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, stb] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object, rpt] */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xgn xgnVar;
        switch (this.$cid) {
            case 0:
                ((rnp) this.a).b();
                break;
            case 1:
                ((rqt) this.a).k();
                break;
            case 2:
                ((rnp) this.a).j(7);
                break;
            case 3:
                ((rnp) this.a).j(7);
                break;
            case 4:
                ((rnp) this.a).j(6);
                break;
            case 5:
                ((rnp) this.a).b();
                break;
            case 6:
                ((xsc) this.a).ad();
                break;
            case 7:
                this.a.k();
                break;
            case 8:
                rpo rpoVar = (rpo) this.a;
                byte[] bArr = rpoVar.e;
                if (bArr != null && (xgnVar = rpoVar.c) != null) {
                    xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(bArr), null);
                }
                ajwo ajwoVar = rpoVar.d;
                if (ajwoVar != null) {
                    rpoVar.a.a(ajwoVar);
                }
                break;
            case 9:
                Runnable runnable = ((ssv) this.a).v;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 10:
                Runnable runnable2 = ((ssv) this.a).w;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 11:
                Runnable runnable3 = ((ssz) this.a).x;
                if (runnable3 != null) {
                    runnable3.run();
                }
                break;
            case 12:
                ssz sszVar = (ssz) this.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sszVar.a());
                afxw.g(spannableStringBuilder);
                if (sszVar.m() || !(sszVar.D || sszVar.r())) {
                    sszVar.dismiss();
                } else {
                    sszVar.B.setCancelable(false);
                    sszVar.B.setCanceledOnTouchOutside(false);
                    sszVar.l(sszVar.C);
                    sszVar.o(false);
                    sszVar.s.setVisibility(0);
                    sszVar.r.setEnabled(false);
                    sszVar.E = true;
                    srb srbVar = sszVar.J;
                    if (srbVar != null) {
                        String string = spannableStringBuilder.toString();
                        srd srdVar = srbVar.a;
                        Long l = srbVar.d;
                        sre sreVar = srbVar.c;
                        ?? r5 = srbVar.f;
                        if (!srdVar.h.h()) {
                            boolean z = srbVar.e;
                            int i = srbVar.b;
                            ((bp) r5).dismiss();
                            srdVar.i(srdVar.b.getText(R.string.common_error_connection), agdf.a, i, sreVar, r5, l, z, false);
                        } else if (sreVar.n - 1 != 0) {
                            srdVar.l(string, sreVar, r5);
                        } else {
                            srdVar.k(string, sreVar, r5, l);
                        }
                    }
                }
                break;
            case 13:
                Runnable runnable4 = ((ssz) this.a).w;
                if (runnable4 != null) {
                    runnable4.run();
                }
                break;
            case 14:
                ((ssz) this.a).B.cancel();
                break;
            case 15:
                swx swxVar = (swx) this.a;
                swxVar.h();
                swxVar.i();
                break;
            case 16:
                ((uib) this.a).d();
                break;
            case 17:
                ((uhq) this.a).a.d();
                break;
            case 18:
                ((qcb) this.a).d();
                break;
            case 19:
                Object obj = this.a;
                if (((uii) obj).n()) {
                    ((bp) obj).dismiss();
                } else {
                    ((agrc) ((agrc) uii.k.c()).k("com/google/android/libraries/youtube/creation/common/ui/bottomsheet/CreationBottomSheetDialog", "onCreateView", 285, "CreationBottomSheetDialog.java")).t("Invalid fragment state while attempting to dismiss (close button clicked)");
                }
                break;
            default:
                uiv uivVar = (uiv) this.a;
                if (uivVar.n != 1) {
                    uivVar.u.k(uiv.a).f();
                    uivVar.n = 1;
                    int[] iArr = new int[2];
                    uivVar.e.getLocationOnScreen(iArr);
                    uivVar.n(1.0f);
                    ScheduledFuture scheduledFuture = uivVar.k;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    uivVar.q(true, iArr[1]);
                    uivVar.m();
                    int i2 = 0;
                    while (true) {
                        View[] viewArr = uivVar.h;
                        if (i2 >= viewArr.length) {
                            nuo.t(4, uivVar.i);
                            awmd awmdVar = uivVar.s;
                            if (!((ujd) awmdVar.io()).b()) {
                                Map map = ((ujd) awmdVar.io()).b;
                                for (CreationButtonView creationButtonView : uivVar.g()) {
                                    String str = creationButtonView.d;
                                    if (str != null && ((Integer) j$.util.Map.EL.getOrDefault(map, str, 0)).intValue() == 0 && creationButtonView.isShown()) {
                                        map.put(creationButtonView.d, 1);
                                    }
                                }
                                uivVar.o();
                            }
                            afxw.z(new uiw(), uivVar.b);
                        } else {
                            View view2 = viewArr[i2];
                            if (view2 == null || view2.getVisibility() != 0) {
                                uivVar.i[i2] = null;
                            } else {
                                uivVar.i[i2] = viewArr[i2];
                            }
                            i2++;
                        }
                        break;
                    }
                }
                break;
        }
    }

    public rnx(rpt rptVar, int i) {
        this.$cid = i;
        this.a = rptVar;
    }
}
