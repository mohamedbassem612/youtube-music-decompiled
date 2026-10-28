package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class awc extends awg {
    private static int i(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    private static final Font j(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int i2 = i(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int i4 = i(fontStyle, font2.getStyle());
            if (i4 < i2) {
                font = font2;
                i2 = i4;
            }
        }
        return font;
    }

    @Override // defpackage.awg
    public final Typeface a(Context context, CancellationSignal cancellationSignal, axd[] axdVarArr, int i) {
        try {
            FontFamily fontFamilyF = f(cancellationSignal, axdVarArr, context.getContentResolver());
            if (fontFamilyF != null) {
                return new Typeface.CustomFallbackBuilder(fontFamilyF).setStyle(j(fontFamilyF, i).getStyle()).build();
            }
            return null;
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.awg
    public final Typeface b(Context context, zs zsVar, Resources resources, int i) {
        try {
            Object obj = zsVar.a;
            int length = ((axd[]) obj).length;
            FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                axd axdVar = ((axd[]) obj)[i2];
                try {
                    Font fontBuild = new Font.Builder(resources, axdVar.e).setWeight(axdVar.b).setSlant(axdVar.c ? 1 : 0).setTtcIndex(axdVar.a).setFontVariationSettings(axdVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(j(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.awg
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected Font e(axd axdVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    protected final FontFamily f(CancellationSignal cancellationSignal, axd[] axdVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (axd axdVar : axdVarArr) {
            if (axdVar.a()) {
                fontBuild = e(axdVar);
            } else {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor((Uri) axdVar.f, "r", cancellationSignal);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(axdVar.b).setSlant(axdVar.c ? 1 : 0).setTtcIndex(axdVar.a);
                            String str = axdVar.d;
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        fontBuild = null;
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    @Override // defpackage.awg
    protected final axd g(axd[] axdVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // defpackage.awg
    public final Typeface h(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyF = f(null, (axd[]) list.get(0), contentResolver);
            if (fontFamilyF == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyF);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyF2 = f(null, (axd[]) list.get(i2), contentResolver);
                if (fontFamilyF2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyF2);
                }
            }
            return customFallbackBuilder.setStyle(j(fontFamilyF, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.awg
    protected final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
