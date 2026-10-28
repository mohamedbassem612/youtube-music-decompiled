package defpackage;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.notifications.platform.executor.impl.GnpExecutorApiService;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ooz implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ooz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputMethodManager inputMethodManager;
        switch (this.$cid) {
            case 0:
                ((ooy) this.a).m(true);
                return;
            case 1:
                ((ood) this.a).a.get();
                return;
            case 2:
                Object obj = this.a;
                orw orwVar = (orw) obj;
                if (!orwVar.requestFocus() || (inputMethodManager = (InputMethodManager) orwVar.getContext().getSystemService("input_method")) == null) {
                    return;
                }
                inputMethodManager.showSoftInput((View) obj, 1);
                return;
            case 3:
                orw orwVar2 = (orw) this.a;
                orwVar2.clearFocus();
                InputMethodManager inputMethodManager2 = (InputMethodManager) orwVar2.getContext().getSystemService("input_method");
                IBinder windowToken = orwVar2.getWindowToken();
                if (inputMethodManager2 == null || windowToken == null) {
                    return;
                }
                inputMethodManager2.hideSoftInputFromWindow(windowToken, 0);
                return;
            case 4:
                orx.e((View) this.a);
                return;
            case 5:
                orx orxVar = (orx) this.a;
                View view = orxVar.a;
                if (view != null) {
                    orx.e(view);
                    orxVar.c();
                    return;
                }
                return;
            case 6:
                Object obj2 = this.a;
                otf otfVar = (otf) obj2;
                mew mewVar = otfVar.d;
                if (mewVar != null) {
                    otfVar.b.d(mewVar, ors.b().a());
                }
                qpj.e(new ooz(obj2, 7));
                return;
            case 7:
                ote oteVar = ((otf) this.a).a;
                if (oteVar != null) {
                    oteVar.b();
                    return;
                }
                return;
            case 8:
                ((fce) this.a).stop();
                return;
            case 9:
                ((fce) this.a).start();
                return;
            case 10:
                ((otv) this.a).i();
                return;
            case 11:
                otu.a((Drawable) this.a);
                return;
            case 12:
                Object obj3 = this.a;
                ovc ovcVar = (ovc) obj3;
                if (ovcVar.b == null || ovcVar.c) {
                    return;
                }
                ovcVar.a.a(obj3);
                ovcVar.b = null;
                if (Memory.peekByte(FlagServices.b().c + 105) != 0) {
                    ovcVar.invalidateSelf();
                    return;
                }
                return;
            case 13:
                ((Drawable) this.a).invalidateSelf();
                return;
            case 14:
                NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) this.a;
                NodeTreeProcessorImpl.jniDeleteNodeTreeProcessor(nodeTreeProcessorImpl.elementsRuntime.getHandle(), nodeTreeProcessorImpl.c);
                return;
            case 15:
                Object obj4 = this.a;
                try {
                    ((owb) obj4).ai(((owb) obj4).getWidth(), ((owb) obj4).getHeight());
                    return;
                } finally {
                    ((owb) obj4).a.set(false);
                }
            case 16:
                ActionMode actionMode = ((oxe) this.a).k;
                if (actionMode != null) {
                    actionMode.invalidate();
                    return;
                }
                return;
            case 17:
                oyf oyfVar = (oyf) this.a;
                if (oyfVar.getChildCount() == 0) {
                    if (oyfVar.v.getParent() instanceof ViewGroup) {
                        ((ViewGroup) oyfVar.v.getParent()).removeView(oyfVar.v);
                    }
                    oyfVar.addView(oyfVar.v);
                }
                int paddingLeft = oyfVar.getPaddingLeft();
                int paddingTop = oyfVar.getPaddingTop();
                int width = (oyfVar.getWidth() - paddingLeft) - oyfVar.getPaddingRight();
                int height = (oyfVar.getHeight() - paddingTop) - oyfVar.getPaddingBottom();
                oyfVar.v.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                oyfVar.v.layout(paddingLeft, paddingTop, width + paddingLeft, height + paddingTop);
                oyfVar.u.set(false);
                return;
            case 18:
                ((plm) this.a).a.cancel(false);
                return;
            case 19:
                ((pnh) this.a).a();
                return;
            default:
                GnpExecutorApiService gnpExecutorApiService = (GnpExecutorApiService) this.a;
                gnpExecutorApiService.c--;
                gnpExecutorApiService.a();
                return;
        }
    }
}
