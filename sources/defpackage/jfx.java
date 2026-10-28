package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jfx implements View.OnLayoutChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ jfx(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v24, types: [avls, java.lang.Object] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mmf mmfVar;
        View viewA;
        RecyclerView recyclerView;
        int i9 = 4;
        switch (this.$cid) {
            case 0:
                jfz jfzVar = (jfz) this.a;
                anzn anznVar = jfzVar.c;
                if (anznVar != null) {
                    if (!jfzVar.f) {
                        alay alayVar = anznVar.e;
                        if (alayVar == null) {
                            alayVar = alay.a;
                        }
                        ixt.J(ackj.k(null, alayVar, null, false).toString(), jfzVar.e, jfzVar.a);
                        break;
                    } else {
                        alay alayVar2 = anznVar.e;
                        if (alayVar2 == null) {
                            alayVar2 = alay.a;
                        }
                        String string = ackj.k(null, alayVar2, null, false).toString();
                        LinearLayout linearLayout = jfzVar.e;
                        YouTubeTextView youTubeTextView = jfzVar.a;
                        if (string != null && linearLayout != null && youTubeTextView != null) {
                            ixt.K(youTubeTextView, string, 1, linearLayout.getMeasuredWidth());
                            break;
                        }
                    }
                }
                break;
            case 1:
                jfz jfzVar2 = (jfz) this.a;
                anzn anznVar2 = jfzVar2.c;
                if (anznVar2 != null) {
                    alay alayVar3 = anznVar2.f;
                    if (alayVar3 == null) {
                        alayVar3 = alay.a;
                    }
                    ixt.J(ackj.k(null, alayVar3, null, false).toString(), jfzVar2.d, jfzVar2.b);
                }
                break;
            case 2:
                jig jigVar = (jig) this.a;
                TextView textView = jigVar.b;
                if (textView.getLineCount() != jigVar.e) {
                    jigVar.e = textView.getLineCount();
                    ObjectAnimator objectAnimator = jigVar.a;
                    if (!objectAnimator.isRunning()) {
                        objectAnimator.setIntValues(jigVar.c, jigVar.a());
                    }
                }
                break;
            case 3:
                int measuredHeight = view.getMeasuredHeight();
                jjy jjyVar = (jjy) this.a;
                jjyVar.p = measuredHeight;
                ImageView imageView = jjyVar.f;
                if (imageView.getLayoutParams() != null) {
                    imageView.getLayoutParams().height = jjyVar.p;
                    imageView.requestLayout();
                }
                View view2 = jjyVar.g;
                if (view2.getLayoutParams() != null) {
                    view2.getLayoutParams().height = jjyVar.p;
                    view2.requestLayout();
                }
                View view3 = jjyVar.h;
                if (view3.getLayoutParams() != null) {
                    view3.getLayoutParams().height = jjyVar.p;
                    view3.requestLayout();
                }
                break;
            case 4:
                jqf jqfVar = (jqf) this.a;
                jqc jqcVarD = jqfVar.d();
                int[] iArr = jqcVarD.a;
                float[] fArr = jqcVarD.b;
                if (Build.VERSION.SDK_INT < 29) {
                    jqh jqhVar = jqfVar.a;
                    if (jqhVar != null) {
                        jqhVar.a(iArr, fArr);
                    }
                } else {
                    ggf ggfVar = jqfVar.b;
                    if (!Arrays.equals(ggfVar.d, iArr) || !Arrays.equals(ggfVar.e, fArr)) {
                        ValueAnimator valueAnimator = ggfVar.a;
                        if (valueAnimator.isRunning()) {
                            valueAnimator.cancel();
                        }
                        ggfVar.d = iArr;
                        ggfVar.c = iArr;
                        ggfVar.e = fArr;
                        ggfVar.c();
                    }
                }
                break;
            case 5:
                if ((i3 - i != i7 - i5 || i4 - i2 != i8 - i6) && (viewA = (mmfVar = ((mme) this.a).e).a()) != null) {
                    mmfVar.h(viewA);
                }
                break;
            case 6:
                ovk ovkVar = (ovk) this.a;
                ovkVar.t();
                if (Memory.peekByte(FlagServices.b().c + 84) != 0 && (recyclerView = ovkVar.d) != null) {
                    ovkVar.s(recyclerView);
                    break;
                }
                break;
            case 7:
                ?? r6 = this.a;
                if (!r6.f()) {
                    r6.c(new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom()));
                }
                break;
            case 8:
                int i10 = i4 - i2;
                int i11 = i8 - i6;
                Object obj = this.a;
                if (i10 != i11 || i3 - i != i7 - i5 || !((uiv) obj).t) {
                    uiv uivVar = (uiv) obj;
                    int iRound = Math.round(uivVar.r.getHeight() / (uivVar.b.getResources().getDisplayMetrics().xdpi / 160.0f));
                    if (iRound <= 567) {
                        i9 = 3;
                    } else if (iRound > 624) {
                        if (iRound <= 679) {
                            i9 = 5;
                        } else if (iRound <= 719) {
                            i9 = 6;
                        } else if (iRound <= 767) {
                            i9 = 7;
                        } else if (iRound <= 816) {
                            i9 = 8;
                        } else {
                            i9 = iRound <= 863 ? 9 : 10;
                        }
                    }
                    int i12 = uivVar.p;
                    int iMin = Math.min(i9, 5);
                    uivVar.p = iMin;
                    if (i12 != iMin) {
                        uivVar.l.kk(Integer.valueOf(iMin));
                    }
                    uivVar.h();
                    if (!uivVar.t) {
                        uivVar.t = true;
                    }
                }
                break;
            case 9:
                Object obj2 = this.a;
                int i13 = vpo.a;
                vpo.c((View) obj2, view.getVisibility() == 0);
                break;
            case 10:
                ((vrx) this.a).e.kk(Boolean.valueOf(view.getVisibility() == 0 && Math.abs(i3 - i) > 0 && Math.abs(i4 - i2) > 0));
                break;
            case 11:
                if (i4 != i8) {
                    Object obj3 = this.a;
                    zpr zprVar = (zpr) obj3;
                    BottomSheetBehavior bottomSheetBehavior = zprVar.e;
                    if (bottomSheetBehavior != null) {
                        int iA = zprVar.a(zprVar.b.getHeight());
                        tym.h(zprVar.d, new tyl(iA, 1), ViewGroup.LayoutParams.class);
                        bottomSheetBehavior.Q(iA);
                        if (bottomSheetBehavior.F != 5) {
                            bottomSheetBehavior.I(4);
                            zprVar.j();
                        }
                    } else {
                        zprVar.a.execute(new zdv(obj3, 19));
                    }
                }
                break;
            case 12:
                ((acoz) this.a).c.setY(i4);
                break;
            default:
                ((afex) this.a).C(view);
                break;
        }
    }

    public jfx(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
