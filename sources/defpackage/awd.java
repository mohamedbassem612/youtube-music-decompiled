package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class awd extends awc {
    @Override // defpackage.awc
    protected final Font e(axd axdVar) {
        Font fontD;
        String authority = axdVar.a() ? ((Uri) axdVar.f).getAuthority() : null;
        if (authority == null) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(authority, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            typefaceCreate = null;
        }
        if (typefaceCreate == null || (fontD = avy.d(typefaceCreate)) == null) {
            return null;
        }
        String str = axdVar.d;
        if (TextUtils.isEmpty(str)) {
            return fontD;
        }
        try {
            return new Font.Builder(fontD).setFontVariationSettings(str).build();
        } catch (IOException unused) {
            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
