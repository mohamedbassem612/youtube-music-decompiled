package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgv implements nrw {
    public static final agrf a = agrf.h("com/google/android/libraries/elements/contrib/commands/ViewToImageBytesCommandHandler");
    private static final Bitmap.CompressFormat d = Bitmap.CompressFormat.PNG;
    public final avmb b;
    public final boolean c;
    private final Context e;
    private final nuc f;

    public mgv(Context context, nuc nucVar, avmb avmbVar, Optional optional) {
        context.getClass();
        this.e = context;
        this.f = nucVar;
        this.b = avmbVar;
        this.c = ((Boolean) optional.orElse(Boolean.FALSE)).booleanValue();
    }

    public static final Window g(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow();
            }
        }
        return null;
    }

    private static View h(String str, View view) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.pollFirst();
            if (view2 != null) {
                if (str.equals(view2.getTag(R.id.elements_accessibility_view_tag_id))) {
                    return view2;
                }
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        arrayDeque.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.nrx
    public final aigw a() {
        return asrb.b;
    }

    @Override // defpackage.nrx
    public final aslz b() {
        return rpi.A();
    }

    @Override // defpackage.nrw
    public final /* bridge */ /* synthetic */ avlb c(Object obj, nrv nrvVar) {
        asrb asrbVar = (asrb) obj;
        View viewC = nrvVar.c();
        if (viewC == null) {
            return avlb.m(new IllegalStateException("Unable to locate the component's view."));
        }
        if ((asrbVar.c & 1) == 0 || asrbVar.d.isEmpty()) {
            return avlb.m(new IllegalArgumentException("No target id has been provided."));
        }
        if ((asrbVar.c & 2) == 0 || asrbVar.e.isEmpty()) {
            return avlb.m(new IllegalArgumentException("No local file name has been provided."));
        }
        String str = asrbVar.d;
        View rootView = viewC.getRootView();
        View view = null;
        if (rootView != null) {
            View viewH = h(str, rootView);
            if (viewH == null) {
                Window windowG = g(viewC);
                View decorView = windowG != null ? windowG.getDecorView() : null;
                if (decorView != null) {
                    viewH = h(str, decorView);
                }
            }
            if (viewH != null) {
                view = viewH;
            }
        }
        return view == null ? avlb.m(new IllegalArgumentException("Unable to find the View.")) : avlb.g(new wbs(this, view, asrbVar, nrvVar, 1));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    public final void d(String str, Bitmap bitmap, nrv nrvVar) {
        String message;
        File file = new File(this.e.getCacheDir(), "image_share");
        file.mkdirs();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
            try {
                if (!bitmap.compress(d, 100, fileOutputStream)) {
                    throw new IOException("Failed to compress bitmap to PNG");
                }
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            nuc nucVar = this.f;
            nsl nslVar = nrvVar.i;
            aslh aslhVar = aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR;
            if (e.getMessage() != null) {
                message = e.getMessage();
            } else {
                message = "Unknown error";
            }
            nucVar.c(aslhVar, nslVar, "Unable to compress image to internal storage: %s", message);
            throw e;
        }
        nuc nucVar2 = this.f;
        nsl nslVar2 = nrvVar.i;
        aslh aslhVar2 = aslh.LOG_TYPE_COMMAND_EXECUTION_ERROR;
        if (e.getMessage() != null) {
            message = e.getMessage();
        } else {
            message = "Unknown error";
        }
        nucVar2.c(aslhVar2, nslVar2, "Unable to compress image to internal storage: %s", message);
        throw e;
    }

    @Override // defpackage.nrw
    public final /* synthetic */ avlb e(mew mewVar, nrv nrvVar) {
        return nqw.a(this, mewVar, nrvVar);
    }

    public final void f(View view, String str, nrv nrvVar, avpr avprVar) {
        if (avprVar.f()) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        avnr.i(avprVar, avlb.n(new mgt(this, str, bitmapCreateBitmap, nrvVar, 0)).v(this.b).F(new hoi(avprVar, 9), new jgq(avprVar, 14)));
    }
}
