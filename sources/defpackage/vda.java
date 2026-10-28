package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.creation.mediapicker.greenscreen.GreenScreenMediaThumbnailContainer;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vda {
    public final Context a;
    public final HorizontalScrollView b;
    public final ViewGroup c;
    public final int d;
    public ArrayList g;
    public View h;
    public final vcz j;
    public final boolean k;
    public final adhv l;
    public final zvl m;
    public final roq n;
    public xsc o;
    private final Executor p;
    private final adxj q;
    private final GradientDrawable r;
    private final xsc s;
    private final qcb t;
    private final qcb u;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList i = new ArrayList();

    public vda(Context context, HorizontalScrollView horizontalScrollView, ViewGroup viewGroup, Executor executor, roq roqVar, qcb qcbVar, xsc xscVar, qcb qcbVar2, vcz vczVar, adxj adxjVar, boolean z, adhv adhvVar, zvl zvlVar) {
        this.a = context;
        this.b = horizontalScrollView;
        this.c = viewGroup;
        this.p = executor;
        this.s = xscVar;
        this.l = adhvVar;
        this.m = zvlVar;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.d = displayMetrics.widthPixels;
        this.n = roqVar;
        this.t = qcbVar;
        this.u = qcbVar2;
        this.j = vczVar;
        this.q = adxjVar;
        this.k = z;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.r = gradientDrawable;
        gradientDrawable.setColor(tzk.i(context, R.attr.ytOverlayBackgroundMedium));
    }

    public final Drawable a(arqz arqzVar) {
        Context context = this.a;
        Drawable drawableD = dl.d(context, this.q.a(arqzVar));
        if (drawableD == null) {
            return null;
        }
        drawableD.setTint(context.getColor(R.color.yt_white1));
        drawableD.setTintMode(PorterDuff.Mode.SRC_ATOP);
        return drawableD;
    }

    public final View b(int i) {
        LayoutInflater layoutInflater = (LayoutInflater) this.a.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(i, this.c, false);
        View viewFindViewById = viewInflate.findViewById(R.id.green_screen_media_thumbnail_container);
        if (!(viewFindViewById instanceof GreenScreenMediaThumbnailContainer)) {
            return viewInflate;
        }
        GreenScreenMediaThumbnailContainer greenScreenMediaThumbnailContainer = (GreenScreenMediaThumbnailContainer) viewFindViewById;
        greenScreenMediaThumbnailContainer.setOutlineProvider(new vdb(greenScreenMediaThumbnailContainer));
        greenScreenMediaThumbnailContainer.setClipToOutline(true);
        return viewInflate;
    }

    public final void c(uji ujiVar) {
        int i = ujiVar.i;
        if (i != 0 && (i == 1 || i == 2)) {
            qcb qcbVar = this.t;
            Uri uri = ujiVar.b;
            uoa uoaVar = (uoa) qcbVar.a;
            Uri uri2 = (Uri) uoaVar.z.get(uri);
            if (uri2 == null) {
                zvl zvlVar = uoaVar.g;
                zvj zvjVarA = zvk.a();
                zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA.j = 70;
                zvjVarA.i = 278;
                zvjVarA.d("No original image uri found for thumbnail uri");
                zvlVar.a(zvjVarA.a());
            } else {
                uoaVar.g(uri2);
            }
        }
        roq roqVar = this.n;
        if (roqVar != null) {
            roqVar.k(xhb.b(128645)).d();
        }
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void d(uji ujiVar, View view) {
        ListenableFuture listenableFutureAp;
        boolean z = false;
        z = false;
        if (ujiVar.i == 0) {
            TextView textView = (TextView) view.findViewById(R.id.video_duration_label);
            long j = ujiVar.f;
            int i = vcv.a;
            textView.setText(j > 1000 ? typ.i(j / 1000, 3) : "0:00");
            textView.setVisibility(j > 0 ? 0 : 8);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.green_screen_media_item_thumbnail);
        vcz vczVar = this.j;
        if (!vczVar.h) {
            Context context = this.a;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(((Integer) vczVar.d.orElse(Integer.valueOf(R.dimen.green_screen_media_item_thumbnail_view_size))).intValue());
            aljj aljjVar = ujiVar.g;
            xsc xscVar = this.s;
            if (aljjVar == null) {
                context.getContentResolver();
                listenableFutureAp = ahno.ap(new vdc(xscVar, ujiVar, dimensionPixelSize, z ? 1 : 0), xscVar.c);
            } else {
                listenableFutureAp = ahno.ap(new tsn(ujiVar, context.getContentResolver(), 5), xscVar.c);
            }
            taf.i(listenableFutureAp, this.p, new roc(this, 13), new rjy(this, imageView, ujiVar, 9, (char[]) null), null);
            return;
        }
        aljj aljjVar2 = ujiVar.g;
        if (aljjVar2 != null && !aljj.a.equals(aljjVar2)) {
            z = true;
        }
        imageView.setScaleType(z ? ImageView.ScaleType.MATRIX : ImageView.ScaleType.CENTER_CROP);
        adhv adhvVar = this.l;
        Uri uri = ujiVar.b;
        adhq adhqVarA = adhr.a();
        adhqVarA.h = 1;
        adhqVarA.d = new vcw(this, z, aljjVar2);
        adhvVar.i(imageView, uri, adhqVarA.a());
    }

    public final View e(uji ujiVar) {
        View viewB = b(R.layout.green_screen_media_picker_list_item);
        char[] cArr = null;
        if (viewB == null) {
            viewB = null;
        } else {
            vcz vczVar = this.j;
            Optional optional = vczVar.g;
            if (optional.isPresent()) {
                Resources resources = this.a.getResources();
                ((Integer) optional.get()).intValue();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.multi_image_editor_thumbnail_list_item_horizontal_margin);
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(new tyj(dimensionPixelSize, 0));
                arrayDeque.add(new tyi(dimensionPixelSize, 0));
                tym.h(viewB, new tye(arrayDeque), LinearLayout.LayoutParams.class);
            }
            Optional optional2 = vczVar.e;
            if (optional2.isPresent()) {
                Resources resources2 = this.a.getResources();
                ((Integer) optional2.get()).intValue();
                int dimensionPixelSize2 = resources2.getDimensionPixelSize(R.dimen.multi_image_editor_thumbnail_list_item_outline_size);
                tym.j(viewB, dimensionPixelSize2, dimensionPixelSize2);
            }
            Optional optional3 = vczVar.d;
            if (optional3.isPresent()) {
                Resources resources3 = this.a.getResources();
                ((Integer) optional3.get()).intValue();
                int dimensionPixelSize3 = resources3.getDimensionPixelSize(R.dimen.multi_image_editor_thumbnail_list_item_view_size);
                tym.j(viewB.findViewById(R.id.green_screen_media_item_thumbnail), dimensionPixelSize3, dimensionPixelSize3);
                tym.j(viewB.findViewById(R.id.green_screen_media_thumbnail_container), dimensionPixelSize3, dimensionPixelSize3);
            }
            Optional optional4 = vczVar.f;
            if (optional4.isPresent()) {
                View viewFindViewById = viewB.findViewById(R.id.green_screen_media_item_thumbnail_border);
                ((Integer) optional4.get()).intValue();
                viewFindViewById.setBackgroundResource(R.drawable.multi_image_editor_thumbnail_list_item_border);
            }
            d(ujiVar, viewB);
        }
        if (viewB == null) {
            return null;
        }
        this.e.put(ujiVar, f(viewB));
        viewB.setContentDescription(ujiVar.c);
        int i = ujiVar.i;
        if (i == 0 || i == 1 || i == 2) {
            viewB.setOnClickListener(new jip(this, ujiVar, 19, cArr));
        }
        return viewB;
    }

    public final xsc f(View view) {
        ght ghtVar = ((gif) this.u.a).c.a;
        return new xsc(view, new uhy((ahey) ghtVar.du.io()));
    }
}
