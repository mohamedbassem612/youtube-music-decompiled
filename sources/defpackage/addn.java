package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class addn {
    public final Object a;

    public addn(View view, int i, View view2) {
        view.getClass();
        view2.getClass();
        aefh aefhVar = new aefh(view2.getContext());
        this.a = aefhVar;
        aefhVar.c = view;
        aefhVar.a = new PopupWindow(aefhVar);
        aefhVar.addView(view);
        if (a.az(i)) {
            if (a.az(i)) {
                int[] iArr = new int[2];
                view2.getLocationInWindow(iArr);
                int iG = g(aefhVar);
                int i2 = view2.getResources().getDisplayMetrics().heightPixels;
                int iG2 = g(view2);
                if (i != 1 ? iG >= (i2 - iG2) - iArr[1] : iG >= iArr[1]) {
                    i = i == 1 ? 2 : 1;
                }
            }
        } else if (!a.az(i)) {
            int iC = c(i, view2);
            int[] iArr2 = new int[2];
            view2.getLocationInWindow(iArr2);
            int iH = h(aefhVar);
            int i3 = view2.getResources().getDisplayMetrics().widthPixels;
            int iH2 = h(view2);
            if (iC != 5 ? iH >= (i3 - iH2) - iArr2[0] : iH >= iArr2[0]) {
                i = i == 3 ? 4 : 3;
            }
        }
        aefhVar.e = view2;
        aefhVar.a();
        aefhVar.d = i;
        aefhVar.f = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r5 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r5 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, android.view.View r5) {
        /*
            int r0 = defpackage.bac.a
            int r5 = r5.getLayoutDirection()
            r0 = 1
            if (r4 == r0) goto L24
            r1 = 2
            if (r4 == r1) goto L23
            r1 = 3
            r2 = 6
            r3 = 5
            if (r4 == r1) goto L1d
            r1 = 4
            if (r4 != r1) goto L17
            if (r5 != r0) goto L1f
            goto L21
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L1d:
            if (r5 != r0) goto L21
        L1f:
            r0 = r2
            goto L24
        L21:
            r0 = r3
            goto L24
        L23:
            r0 = r1
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.addn.c(int, android.view.View):int");
    }

    private static int g(View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        view.measure(0, 0);
        return view.getMeasuredHeight();
    }

    private static int h(View view) {
        int width = view.getWidth();
        if (width != 0) {
            return width;
        }
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }

    public final boolean a() {
        return ((AtomicReference) this.a).get() == null;
    }

    public final avpr b() {
        avpr avprVar = (avpr) ((AtomicReference) this.a).getAndSet(null);
        if (avprVar != null) {
            return avprVar;
        }
        throw new nud("ElementCallback was already consumed");
    }

    public final void d() {
        PopupWindow popupWindow = ((aefh) this.a).a;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean e() {
        return ((aefh) this.a).isShown();
    }

    public final jwa f() {
        return jwb.e((Context) this.a);
    }

    public addn(awmd awmdVar) {
        this.a = awmdVar;
    }

    public addn(avpr avprVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.a = atomicReference;
        atomicReference.set(avprVar);
    }

    public addn(Context context) {
        this.a = context;
    }
}
