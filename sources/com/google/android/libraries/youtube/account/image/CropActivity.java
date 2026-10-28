package com.google.android.libraries.youtube.account.image;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import defpackage.adhx;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.fl;
import defpackage.rmx;
import defpackage.rmz;
import defpackage.tuk;
import defpackage.tyh;
import defpackage.tyl;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class CropActivity extends rmz implements View.OnTouchListener, View.OnLayoutChangeListener {
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/account/image/CropActivity");
    private LinearLayout A;
    private TextView B;
    private FrameLayout C;
    private LinearLayout D;
    private View E;
    private TextView F;
    private FrameLayout G;
    private FrameLayout H;
    private TextView I;
    private View J;
    private Matrix K;
    private final PointF L = new PointF();
    private final PointF M = new PointF();
    private double N = 1.0d;
    private final float[] O = new float[9];
    private boolean P = true;
    private boolean Q = true;
    private int R;
    private Uri c;
    private Uri d;
    private CharSequence e;
    private int f;
    private int g;
    private int h;
    private int i;
    private CharSequence j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private CharSequence p;
    private int q;
    private CharSequence r;
    private Pair s;
    private int t;
    private int u;
    private Matrix v;
    private Rect w;
    private Handler x;
    private ImageView y;
    private LinearLayout z;

    private static double b(MotionEvent motionEvent) {
        return Math.hypot(motionEvent.getX(0) - motionEvent.getX(1), motionEvent.getY(0) - motionEvent.getY(1));
    }

    private final Rect c() {
        Matrix matrix = this.v;
        float[] fArr = this.O;
        matrix.getValues(fArr);
        int iCeil = (int) Math.ceil(fArr[2]);
        int iCeil2 = (int) Math.ceil(fArr[5]);
        Rect rect = new Rect(iCeil, iCeil2, ((int) Math.floor((fArr[0] * this.t) + (fArr[3] * this.u))) + iCeil, ((int) Math.floor((fArr[4] * this.u) + (fArr[1] * this.t))) + iCeil2);
        rect.sort();
        return rect;
    }

    private final Rect d() {
        Rect rect = new Rect(this.w);
        Rect rectC = c();
        rect.offset(-rectC.left, -rectC.top);
        double dIntValue = ((Integer) this.s.first).intValue();
        double dWidth = rectC.width();
        double d = rect.left;
        double d2 = rect.top;
        double d3 = dIntValue / dWidth;
        int iMax = Math.max(1, (int) (((double) rect.width()) * d3));
        int i = (int) (d * d3);
        int iHeight = (int) (((double) rect.height()) * d3);
        int i2 = (int) (d2 * d3);
        rect.set(i, i2, iMax + i, Math.max(1, iHeight) + i2);
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    private final void e() {
        double dMin;
        double dMax;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Rect rect;
        int i6;
        int i7;
        int i8;
        Rect rectC = c();
        int i9 = 0;
        if (this.h > 0 || this.i > 0) {
            Rect rectD = d();
            if (this.h >= rectD.width()) {
                double d = this.h;
                double dWidth = rectD.width();
                this.Q = false;
                dMin = d / dWidth;
            } else {
                dMin = 1.0d;
            }
            if (this.i >= rectD.height()) {
                dMin = Math.min(dMin, ((double) this.i) / ((double) rectD.height()));
                this.Q = false;
            }
            if (dMin < 1.0d && this.P) {
                j(this.v, dMin);
                rectC = c();
            }
        }
        if (this.w.width() >= rectC.width()) {
            double dWidth2 = this.w.width();
            double dWidth3 = rectC.width();
            this.P = true;
            dMax = dWidth2 / dWidth3;
        } else {
            dMax = 1.0d;
        }
        if (this.w.height() >= rectC.height()) {
            dMax = Math.max(dMax, ((double) this.w.height()) / ((double) rectC.height()));
            this.P = true;
        }
        if (dMax > 1.0d && this.Q) {
            j(this.v, dMax);
            rectC = c();
        }
        if (rectC.contains(this.w)) {
            return;
        }
        int i10 = this.w.left;
        int i11 = rectC.left;
        Rect rect2 = this.w;
        if (i10 >= i11) {
            if (rect2.right > rectC.right) {
                i2 = this.w.right;
                i3 = rectC.right;
            } else {
                i = 0;
            }
            i4 = this.w.top;
            i5 = rectC.top;
            rect = this.w;
            if (i4 < i5) {
                if (rect.bottom > rectC.bottom) {
                    i7 = this.w.bottom;
                    i8 = rectC.bottom;
                } else {
                    i6 = 0;
                }
                if (i == 0) {
                    i9 = i;
                } else if (i6 == 0) {
                    return;
                }
                this.v.postTranslate(i9, i6);
            }
            i7 = rect.top;
            i8 = rectC.top;
            i6 = i7 - i8;
            if (i == 0) {
                i9 = i;
            } else if (i6 == 0) {
                return;
            }
            this.v.postTranslate(i9, i6);
        }
        i2 = rect2.left;
        i3 = rectC.left;
        i = i2 - i3;
        i4 = this.w.top;
        i5 = rectC.top;
        rect = this.w;
        if (i4 < i5) {
            if (rect.bottom > rectC.bottom) {
                i7 = this.w.bottom;
                i8 = rectC.bottom;
            } else {
                i6 = 0;
            }
            if (i == 0) {
                i9 = i;
            } else if (i6 == 0) {
                return;
            }
            this.v.postTranslate(i9, i6);
        }
        i7 = rect.top;
        i8 = rectC.top;
        i6 = i7 - i8;
        if (i == 0) {
            i9 = i;
        } else if (i6 == 0) {
            return;
        }
        this.v.postTranslate(i9, i6);
    }

    private final void f(View view, tyh tyhVar, Class cls) {
        this.x.post(new rmx(view, tyhVar, cls, 0));
    }

    private static void g(Object obj) {
        obj.getClass();
    }

    private static final Rect h(double d, Rect rect) {
        double dWidth = (((double) rect.width()) / d) * 0.5d;
        Rect rect2 = new Rect(rect.left, rect.centerY() - ((int) Math.round(dWidth)), rect.right, rect.centerY() + ((int) Math.round(dWidth)));
        rect2.sort();
        return rect2;
    }

    private static final Rect i(double d, Rect rect) {
        double dHeight = ((double) rect.height()) * d * 0.5d;
        Rect rect2 = new Rect(rect.centerX() - ((int) Math.round(dHeight)), rect.top, rect.centerX() + ((int) Math.round(dHeight)), rect.bottom);
        rect2.sort();
        return rect2;
    }

    private static final void j(Matrix matrix, double d) {
        float f = (float) d;
        matrix.postScale(f, f);
    }

    @Override // defpackage.rmz, defpackage.cf, defpackage.qe, defpackage.ee, android.app.Activity
    public final void onCreate(Bundle bundle) {
        fl supportActionBar;
        super.onCreate(bundle);
        setContentView(R.layout.activity_crop);
        this.x = new Handler(Looper.getMainLooper());
        this.v = new Matrix();
        this.K = new Matrix();
        this.R = 0;
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/account/image/CropActivity", "readInput", 539, "CropActivity.java")).t("Input for CropActivity is missing");
            setResult(1);
            finish();
        } else {
            this.d = intent.getData();
            Bundle extras = intent.getExtras();
            this.c = (Uri) extras.getParcelable("output");
            this.e = extras.getCharSequence("cropLabel");
            this.f = extras.getInt("widthRatio", 0);
            this.g = extras.getInt("heightRatio", 0);
            this.h = extras.getInt("minWidth", 0);
            this.i = extras.getInt("minHeight", 0);
            this.j = extras.getCharSequence("visualCropLabel");
            this.m = extras.getInt("visualWidthRatio", this.f);
            this.n = extras.getInt("visualHeightRatio", this.g);
            this.p = extras.getCharSequence("visualDoubleCropLabel");
            this.q = extras.getInt("visualDoubleWidthRatio", this.m);
            this.k = extras.getInt("minOutputWidth", 0);
            this.l = extras.getInt("minOutputHeight", 0);
            this.o = extras.getBoolean("compressFormat");
            this.r = extras.getCharSequence("cropInfo");
            if (this.f <= 0 || this.g <= 0) {
                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/account/image/CropActivity", "readInput", 572, "CropActivity.java")).t("Width and height ratio must be positive");
                setResult(1);
                finish();
            } else if (this.m < this.q) {
                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/account/image/CropActivity", "readInput", 579, "CropActivity.java")).t("A double mask width ratio must be smaller or equal to a single mask width ratio");
                setResult(1);
                finish();
            } else {
                try {
                    Pair pairD = adhx.d(getContentResolver(), this.d);
                    this.s = pairD;
                    if (this.h > ((Integer) pairD.first).intValue() || this.i > ((Integer) this.s.second).intValue()) {
                        ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/account/image/CropActivity", "readInput", 597, "CropActivity.java")).x("Selected image is too small. Must be at least %sx%s", this.h, this.i);
                        setResult(2);
                        finish();
                    }
                } catch (FileNotFoundException e) {
                    ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/account/image/CropActivity", "readInput", (char) 589, "CropActivity.java")).t("Image file not found");
                    setResult(1);
                    finish();
                }
            }
        }
        if (isFinishing()) {
            return;
        }
        ImageView imageView = (ImageView) findViewById(R.id.image);
        g(imageView);
        this.y = imageView;
        TextView textView = (TextView) findViewById(R.id.tv_crop_text);
        g(textView);
        this.B = textView;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.area_for_crop);
        g(linearLayout);
        this.z = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.tv_crop);
        g(linearLayout2);
        this.A = linearLayout2;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.top_desktop_crop);
        g(frameLayout);
        this.C = frameLayout;
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.desktop_crop);
        g(linearLayout3);
        this.D = linearLayout3;
        View viewFindViewById = findViewById(R.id.bottom_desktop_crop);
        g(viewFindViewById);
        this.E = viewFindViewById;
        TextView textView2 = (TextView) findViewById(R.id.desktop_crop_text);
        g(textView2);
        this.F = textView2;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.left_mobile_crop);
        g(frameLayout2);
        this.G = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.mobile_crop);
        g(frameLayout3);
        this.H = frameLayout3;
        TextView textView3 = (TextView) findViewById(R.id.mobile_crop_text);
        g(textView3);
        this.I = textView3;
        this.J = findViewById(R.id.right_mobile_crop);
        try {
            Bitmap bitmapB = adhx.b(getContentResolver(), this.d, SemanticState.ReadOnly, SemanticState.ReadOnly);
            if (bitmapB == null) {
                ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/account/image/CropActivity", "initViews", 633, "CropActivity.java")).t("Bitmap for image file is null");
                setResult(1);
                finish();
            } else {
                this.t = bitmapB.getWidth();
                this.u = bitmapB.getHeight();
                this.y.setImageBitmap(bitmapB);
                this.y.setOnTouchListener(this);
                this.y.addOnLayoutChangeListener(this);
                CharSequence charSequence = this.r;
                if (charSequence != null && charSequence.length() > 0) {
                    TextView textView4 = (TextView) findViewById(R.id.crop_info);
                    g(textView4);
                    textView4.setText(this.r);
                    FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.crop_info_layout);
                    g(frameLayout4);
                    tuk.l(frameLayout4, true);
                }
            }
        } catch (FileNotFoundException e2) {
            ((agrc) ((agrc) ((agrc) b.b()).j(e2)).k("com/google/android/libraries/youtube/account/image/CropActivity", "initViews", (char) 627, "CropActivity.java")).t("Image file not found");
            setResult(1);
            finish();
        }
        if (isFinishing() || (supportActionBar = getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.h(true);
        supportActionBar.i(false);
        supportActionBar.j(false);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_menu, menu);
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int dimension;
        float dimension2;
        int i9;
        int i10;
        int dimension3 = ((int) getResources().getDimension(R.dimen.crop_rectangle_margin)) / 2;
        Rect rect = new Rect(i + dimension3, i2 + dimension3, i3 - dimension3, i4 - dimension3);
        rect.sort();
        int i11 = this.f;
        if (i11 > 0 && (i9 = this.g) > 0) {
            double d = ((double) i11) / ((double) i9);
            Rect rectH = h(d, rect);
            if (rectH.height() > rect.height()) {
                rectH = i(d, rect);
            }
            this.w = rectH;
            f(this.z, new tyl(rectH.height(), 1), ViewGroup.LayoutParams.class);
            f(this.A, new tyl(this.w.width(), 0), ViewGroup.LayoutParams.class);
            CharSequence charSequence = this.e;
            if (charSequence != null && charSequence.length() > 0) {
                this.B.setText(this.e);
            }
            int i12 = this.m;
            if (i12 > 0 && (i10 = this.n) > 0) {
                Rect rectH2 = h(((double) i12) / ((double) i10), this.w);
                int iHeight = (this.w.height() - rectH2.height()) / 2;
                f(this.C, new tyl(iHeight, 1), ViewGroup.LayoutParams.class);
                f(this.D, new tyl(rectH2.height(), 1), ViewGroup.LayoutParams.class);
                f(this.E, new tyl(iHeight, 1), ViewGroup.LayoutParams.class);
                tuk.l(this.C, true);
                tuk.l(this.E, true);
                CharSequence charSequence2 = this.j;
                if (charSequence2 != null && charSequence2.length() > 0) {
                    this.F.setText(this.j);
                    tuk.l(this.F, true);
                }
                int i13 = this.q;
                if (i13 > 0.0f) {
                    Rect rectI = i(((double) i13) / ((double) this.n), rectH2);
                    int iWidth = (rectH2.width() - rectI.width()) / 2;
                    f(this.G, new tyl(iWidth, 0), ViewGroup.LayoutParams.class);
                    f(this.H, new tyl(rectI.width(), 0), ViewGroup.LayoutParams.class);
                    f(this.J, new tyl(iWidth, 0), ViewGroup.LayoutParams.class);
                    tuk.l(this.G, true);
                    tuk.l(this.J, true);
                    tuk.l(this.H, true);
                    CharSequence charSequence3 = this.p;
                    if (charSequence3 != null && charSequence3.length() > 0) {
                        this.I.setText(this.p);
                        tuk.l(this.I, true);
                    }
                }
            }
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.crop_info_layout);
        g(frameLayout);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (getResources().getConfiguration().orientation == 2) {
            dimension = (int) getResources().getDimension(R.dimen.crop_info_horizontal_margin_landscape);
            dimension2 = getResources().getDimension(R.dimen.crop_info_bottom_margin_landscape);
        } else {
            dimension = (int) getResources().getDimension(R.dimen.crop_info_horizontal_margin_portrait);
            dimension2 = getResources().getDimension(R.dimen.crop_info_bottom_margin_portrait);
        }
        marginLayoutParams.setMargins(dimension, 0, dimension, (int) dimension2);
        e();
        this.y.setImageMatrix(this.v);
    }

    /* JADX WARN: Code duplicated, block: B:98:0x028d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.Rect] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.graphics.Rect, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.graphics.BitmapRegionDecoder] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v28, types: [agrc] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) throws Throwable {
        ?? IntValue;
        int iIntValue;
        Bitmap bitmapCreateScaledBitmap;
        if (menuItem.getItemId() != R.id.crop_menu_save) {
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        }
        ?? D = d();
        int iWidth = D.width();
        int iHeight = D.height();
        if (iWidth > ((Integer) this.s.first).intValue() || iHeight > ((Integer) this.s.second).intValue()) {
            iWidth = ((Integer) this.s.first).intValue();
            iHeight = ((Integer) this.s.second).intValue();
        } else {
            int i = this.h;
            if (i > 0 && this.i > 0) {
                double dAbs = Math.abs(((double) (iWidth - i)) / ((double) i));
                int i2 = this.h;
                if (i2 > iWidth || this.i > iHeight || dAbs <= 0.019999999552965164d) {
                    iHeight = this.i;
                    iWidth = i2;
                }
            }
        }
        int iMin = Math.min(iHeight, (Math.min(iWidth, (this.f * iHeight) / this.g) * this.g) / this.f);
        D.set(((Rect) D).left, ((Rect) D).top, ((Rect) D).left + ((this.f * iMin) / this.g), ((Rect) D).top + iMin);
        if (((Rect) D).left < 0) {
            IntValue = -((Rect) D).left;
        } else {
            IntValue = ((Rect) D).right > ((Integer) this.s.first).intValue() ? ((Integer) this.s.first).intValue() - ((Rect) D).right : 0;
        }
        if (((Rect) D).top < 0) {
            iIntValue = -((Rect) D).top;
        } else {
            iIntValue = ((Rect) D).bottom > ((Integer) this.s.second).intValue() ? ((Integer) this.s.second).intValue() - ((Rect) D).bottom : 0;
        }
        D.offset(IntValue, iIntValue);
        try {
            try {
                ContentResolver contentResolver = getContentResolver();
                Uri uri = this.d;
                int i3 = this.k;
                if (i3 <= 0) {
                    i3 = this.h;
                }
                int i4 = this.l;
                if (i4 <= 0) {
                    i4 = this.i;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inSampleSize = 1;
                int iWidth2 = D.width() / 2;
                int iHeight2 = D.height() / 2;
                while (i3 > 0 && iWidth2 / options.inSampleSize > i3 && i4 > 0 && iHeight2 / options.inSampleSize > i4) {
                    options.inSampleSize <<= 1;
                }
                int iA = adhx.a(contentResolver, uri);
                ?? rect = D;
                if (iA != 0) {
                    Pair pairD = adhx.d(contentResolver, uri);
                    Matrix matrix = new Matrix();
                    matrix.postTranslate((-((Integer) pairD.first).intValue()) / 2, (-((Integer) pairD.second).intValue()) / 2);
                    matrix.postRotate(-iA);
                    if (adhx.e(iA)) {
                        matrix.postTranslate(((Integer) pairD.second).intValue() / 2, ((Integer) pairD.first).intValue() / 2);
                    } else {
                        matrix.postTranslate(((Integer) pairD.first).intValue() / 2, ((Integer) pairD.second).intValue() / 2);
                    }
                    RectF rectF = new RectF((Rect) D);
                    matrix.mapRect(rectF);
                    rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                }
                ?? r12 = rect;
                ?? NewInstance = BitmapRegionDecoder.newInstance(contentResolver.openInputStream(uri), false);
                try {
                    try {
                        Bitmap bitmapDecodeRegion = NewInstance.decodeRegion(r12, options);
                        if (iA != 0) {
                            Matrix matrix2 = new Matrix();
                            matrix2.postRotate(iA);
                            try {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix2, false);
                                bitmapDecodeRegion.recycle();
                                NewInstance.recycle();
                                bitmapCreateScaledBitmap = bitmapCreateBitmap;
                            } catch (Throwable th) {
                                bitmapDecodeRegion.recycle();
                                throw th;
                            }
                        } else {
                            NewInstance.recycle();
                            bitmapCreateScaledBitmap = bitmapDecodeRegion;
                        }
                        try {
                            if (this.k > bitmapCreateScaledBitmap.getWidth() || this.l > bitmapCreateScaledBitmap.getHeight()) {
                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, this.k, this.l, true);
                            }
                            bitmapCreateScaledBitmap.compress(this.o ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(this.c.getPath()));
                            Intent intent = new Intent();
                            intent.setData(this.c);
                            setResult(-1, intent);
                        } catch (IOException e) {
                            e = e;
                            ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/account/image/CropActivity", "save", 523, "CropActivity.java")).t("IOException saving cropped file");
                            setResult(0);
                        }
                    } catch (IllegalArgumentException e2) {
                        Pair pairD2 = adhx.d(contentResolver, uri);
                        ((agrc) ((agrc) ((agrc) adhx.a.b()).j(e2)).k("com/google/android/libraries/youtube/rendering/image/ImageStorageUtil", "getBitmap", 170, "ImageStorageUtil.java")).H("Unexpected exception while cropping an image: %s, size: %sx%s, crop bounds: %s, scale: x%s, degrees: %s", uri, pairD2.first, pairD2.second, r12, Integer.valueOf(options.inSampleSize), Integer.valueOf(iA));
                        throw e2;
                    }
                } catch (Throwable th2) {
                    NewInstance.recycle();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (IntValue != 0) {
                    IntValue.recycle();
                }
                finish();
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bitmapCreateScaledBitmap = null;
        } catch (Throwable th4) {
            th = th4;
            IntValue = 0;
            if (IntValue != 0) {
                IntValue.recycle();
            }
            finish();
            throw th;
        }
        if (bitmapCreateScaledBitmap != null) {
            bitmapCreateScaledBitmap.recycle();
        }
        finish();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ImageView imageView = (ImageView) view;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.K.set(this.v);
            this.L.set(motionEvent.getX(), motionEvent.getY());
            this.R = 1;
        } else if (action == 1) {
            this.R = 0;
            view.performClick();
        } else if (action == 2) {
            int i = this.R;
            if (i == 1) {
                this.v.set(this.K);
                Matrix matrix = this.v;
                float x = motionEvent.getX();
                PointF pointF = this.L;
                matrix.postTranslate(x - pointF.x, motionEvent.getY() - pointF.y);
            } else if (i == 2) {
                double dB = b(motionEvent);
                if (dB > 10.0d) {
                    double d = dB / this.N;
                    if ((d < 1.0d && this.P) || (d > 1.0d && this.Q)) {
                        this.v.set(this.K);
                        Matrix matrix2 = this.v;
                        PointF pointF2 = this.M;
                        float f = (float) d;
                        matrix2.postScale(f, f, pointF2.x, pointF2.y);
                        if (d < 1.0d) {
                            this.Q = true;
                        } else {
                            this.P = true;
                        }
                    }
                }
            }
            e();
        } else if (action == 5) {
            double dB2 = b(motionEvent);
            this.N = dB2;
            if (dB2 > 10.0d) {
                this.K.set(this.v);
                this.M.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
                this.R = 2;
            }
        } else if (action == 6) {
            this.R = 0;
            view.performClick();
        }
        imageView.setImageMatrix(this.v);
        return true;
    }
}
