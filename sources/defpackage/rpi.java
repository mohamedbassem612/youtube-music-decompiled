package defpackage;

import android.app.Activity;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rpi {
    public static /* synthetic */ aslz A() {
        aihf aihfVarCreateBuilder = aslz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aslz aslzVar = (aslz) aihfVarCreateBuilder.instance;
        aslzVar.c = 1;
        aslzVar.b |= 1;
        return (aslz) aihfVarCreateBuilder.build();
    }

    public static /* synthetic */ Method B() {
        try {
            return String.class.getMethod("encodedLength", Charset.class);
        } catch (ReflectiveOperationException unused) {
            return null;
        }
    }

    public static /* synthetic */ void C(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    public static /* synthetic */ void D(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    public static /* synthetic */ boolean E(long j, long j2) {
        return j < -30000 && j2 > 100000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r3.equals("cbcs") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r3.equals("cbc1") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int F(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L3d
            int r1 = r3.hashCode()
            switch(r1) {
                case 3046605: goto L26;
                case 3046671: goto L1d;
                case 3049879: goto L14;
                case 3049895: goto Lb;
                default: goto La;
            }
        La:
            goto L30
        Lb:
            java.lang.String r1 = "cens"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
            goto L3d
        L14:
            java.lang.String r1 = "cenc"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
            goto L3d
        L1d:
            java.lang.String r1 = "cbcs"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
            goto L2e
        L26:
            java.lang.String r1 = "cbc1"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L30
        L2e:
            r0 = 2
            goto L3d
        L30:
            java.lang.String r1 = "Unsupported protection scheme type '"
            java.lang.String r2 = "'. Assuming AES-CTR crypto mode."
            java.lang.String r3 = defpackage.a.bT(r3, r1, r2)
            java.lang.String r1 = "TrackEncryptionBox"
            defpackage.bvx.e(r1, r3)
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpi.F(java.lang.String):int");
    }

    public static /* synthetic */ byte[] G(bwb bwbVar, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            bwbVar.P(i3);
            int i4 = bwbVar.i() + i3;
            if (bwbVar.i() == 1886547818) {
                return Arrays.copyOfRange(bwbVar.b, i3, i4);
            }
            i3 = i4;
        }
        return null;
    }

    public static /* synthetic */ String H(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public static /* synthetic */ File I(File file, int i, long j, long j2) {
        return new File(file, i + '.' + j + '.' + j2 + ".v3.exo");
    }

    public static /* synthetic */ long J(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, String.valueOf(Long.toString(jAbs, 16)).concat(".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: ".concat(file2.toString()));
    }

    public static /* synthetic */ boolean K(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ byte[] L(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int M(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i < size && i == sparseArray.keyAt(i)) {
            i++;
        }
        return i;
    }

    public static /* synthetic */ void N(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((oh) list.get(size)).a.animate().cancel();
            }
        }
    }

    public static /* synthetic */ anyx Q(Optional optional) {
        return (anyx) optional.get();
    }

    public static /* synthetic */ void R(wog wogVar, String str) {
        aihf aihfVarCreateBuilder = aoie.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aoif.a.createBuilder();
        String strH = wfs.h(str);
        aihfVarCreateBuilder2.copyOnWrite();
        aoif aoifVar = (aoif) aihfVarCreateBuilder2.instance;
        aoifVar.b |= 1;
        aoifVar.c = strH;
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_MANUAL_OFFLINE;
        aihfVarCreateBuilder2.copyOnWrite();
        aoif aoifVar2 = (aoif) aihfVarCreateBuilder2.instance;
        aoifVar2.d = aogfVar.e;
        aoifVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aoie aoieVar = (aoie) aihfVarCreateBuilder.instance;
        aoif aoifVar3 = (aoif) aihfVarCreateBuilder2.build();
        aoifVar3.getClass();
        aoieVar.d = aoifVar3;
        aoieVar.b |= 2;
        wogVar.e((aoie) aihfVarCreateBuilder.build());
    }

    public static /* synthetic */ void S(wog wogVar, String str) {
        aihf aihfVarCreateBuilder = aoie.a.createBuilder();
        aihf aihfVarCreateBuilder2 = aoif.a.createBuilder();
        String strH = wfs.h(str);
        aihfVarCreateBuilder2.copyOnWrite();
        aoif aoifVar = (aoif) aihfVarCreateBuilder2.instance;
        aoifVar.b |= 1;
        aoifVar.c = strH;
        aogf aogfVar = aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE;
        aihfVarCreateBuilder2.copyOnWrite();
        aoif aoifVar2 = (aoif) aihfVarCreateBuilder2.instance;
        aoifVar2.d = aogfVar.e;
        aoifVar2.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        aoie aoieVar = (aoie) aihfVarCreateBuilder.instance;
        aoif aoifVar3 = (aoif) aihfVarCreateBuilder2.build();
        aoifVar3.getClass();
        aoieVar.d = aoifVar3;
        aoieVar.b |= 2;
        wogVar.e((aoie) aihfVarCreateBuilder.build());
    }

    public static /* synthetic */ long T(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 912680550L;
        }
        if (i2 != 2) {
            return i2 != 4 ? 3650722200L : 2738041650L;
        }
        return 1825361100L;
    }

    public static /* synthetic */ int U(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 14;
        }
        if (i2 != 3) {
            return i2 != 4 ? 2 : 15;
        }
        return 13;
    }

    public static /* synthetic */ anws V(anwt anwtVar, int i) {
        for (anws anwsVar : anwtVar.k) {
            int iAS = a.aS(anwsVar.b);
            if (iAS == 0) {
                iAS = 1;
            }
            if (iAS == i) {
                return anwsVar;
            }
        }
        return null;
    }

    public static /* synthetic */ boolean a(aicf aicfVar) {
        int iAV;
        if (aicfVar.c != 7 || (iAV = a.aV(((Integer) aicfVar.d).intValue())) == 0) {
            iAV = 1;
        }
        int i = iAV - 1;
        if (i != 1) {
            if (i == 2) {
                return auvd.a.io().c();
            }
            if (i == 3) {
                return auvd.a.io().b();
            }
            if (!(aicfVar.c == 4 ? (String) aicfVar.d : "").isEmpty()) {
                return true;
            }
        } else if (auvd.a.io().a() && Build.VERSION.SDK_INT != 30) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ RectF b(Layout layout, int i) {
        return new RectF(layout.getLineLeft(i), layout.getLineTop(i) + 1, layout.getLineRight(i), layout.getLineBottom(i) - (i == layout.getLineCount() + (-1) ? 0.0f : layout.getSpacingAdd()));
    }

    public static /* synthetic */ float[] c(float f) {
        return new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    public static /* synthetic */ float[] d(float f) {
        return new float[]{0.0f, 0.0f, f, f, f, f, 0.0f, 0.0f};
    }

    public static /* synthetic */ void e(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (list.get(size) == null) {
                list.remove(size);
            }
        }
    }

    public static /* synthetic */ int f(int[] iArr, int i) {
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch >= 0) {
            while (iBinarySearch < iArr.length - 1) {
                int i2 = iBinarySearch + 1;
                if (iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
        }
        return iBinarySearch;
    }

    public static /* synthetic */ String g(String str, int[] iArr) {
        if (str == null || (length = iArr.length) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        while (true) {
            int length2 = length2 - 1;
            if (length2 < 0) {
                return sb.toString();
            }
            int i = iArr[length2];
            if (i >= 0 && i <= length) {
                sb.insert(i, (char) 160);
            }
        }
    }

    public static /* synthetic */ int h(int i, int i2, Layout layout) {
        if (i2 == 0 || View.MeasureSpec.getMode(i2) == 0 || layout.getHeight() <= View.MeasureSpec.getSize(i2)) {
            return i;
        }
        int size = View.MeasureSpec.getSize(i2);
        int lineForVertical = layout.getLineForVertical(size);
        if (layout.getLineBottom(lineForVertical) <= size) {
            lineForVertical++;
        }
        return Math.min(i, Math.max(1, lineForVertical));
    }

    public static /* synthetic */ int i(int i, Layout layout, float f, int i2) {
        if (i == 1) {
            return layout.getPrimaryHorizontal(i2) > f ? layout.getOffsetToLeftOf(i2) : i2;
        }
        if (i2 <= 0) {
            return i2;
        }
        int i3 = i2 - 1;
        CharSequence text = layout.getText();
        if (i3 > 0 && Character.isLowSurrogate(text.charAt(i3))) {
            int i4 = i2 - 2;
            if (Character.isHighSurrogate(text.charAt(i4))) {
                return i4;
            }
        }
        return i3;
    }

    public static /* synthetic */ int j(SpannableString spannableString, int i) {
        int length;
        AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableString.getSpans(i, i + 1, AbsoluteSizeSpan.class);
        if (absoluteSizeSpanArr == null || (length = absoluteSizeSpanArr.length) == 0) {
            return -1;
        }
        for (int i2 = length - 1; i2 >= 0; i2--) {
            AbsoluteSizeSpan absoluteSizeSpan = absoluteSizeSpanArr[i2];
            if (absoluteSizeSpan != null && absoluteSizeSpan.getSize() > 0) {
                return absoluteSizeSpan.getSize();
            }
        }
        return -1;
    }

    public static /* synthetic */ int k(CharSequence charSequence, TextPaint textPaint, int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(View.MeasureSpec.getSize(i), (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)));
        }
        if (mode == 0) {
            return (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        throw new IllegalArgumentException("Unsupported measure spec mode: " + View.MeasureSpec.getMode(i));
    }

    public static /* synthetic */ int l(Spanned spanned, CharacterStyle characterStyle, CharacterStyle characterStyle2) {
        int iCompare = Integer.compare(spanned.getSpanStart(characterStyle), spanned.getSpanStart(characterStyle2));
        return iCompare == 0 ? Integer.compare(spanned.getSpanEnd(characterStyle2), spanned.getSpanEnd(characterStyle)) : iCompare;
    }

    public static /* synthetic */ TextDirectionHeuristic m(int i, int i2) {
        if (i == 3) {
            return TextDirectionHeuristics.LTR;
        }
        if (i != 4) {
            return i2 == 1 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        return TextDirectionHeuristics.RTL;
    }

    public static /* synthetic */ int[] n(BreakIterator breakIterator, int i, int i2) {
        int[] iArrCopyOf = new int[16];
        int i3 = 0;
        while (i < i2) {
            i = breakIterator.following(i);
            if (i == -1 || i > i2) {
                break;
            }
            int length = iArrCopyOf.length;
            if (i3 >= length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, length << 1);
            }
            iArrCopyOf[i3] = i;
            i3++;
        }
        return Arrays.copyOf(iArrCopyOf, i3);
    }

    public static /* synthetic */ int o(Resources resources, int i) {
        if (Build.VERSION.SDK_INT < 31) {
            return i;
        }
        int i2 = resources.getConfiguration().fontWeightAdjustment;
        if (i2 != Integer.MAX_VALUE) {
            i += i2;
        }
        return Math.max(1, Math.min(1000, i));
    }

    public static /* synthetic */ int p(float f) {
        return (int) (((double) f) + (f > 0.0f ? 0.5d : -0.5d));
    }

    public static /* synthetic */ Typeface q(String str, int i, boolean z) {
        String strAe = ahno.ae(str);
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.create(strAe, 0), i, z);
        }
        if (i <= 500) {
            return Typeface.create(strAe, true == z ? 2 : 0);
        }
        return Typeface.create(strAe, true == z ? 3 : 1);
    }

    public static /* synthetic */ Typeface r(String str) {
        String strAe = ahno.ae(str);
        int i = 0;
        if (strAe.endsWith("-bold")) {
            strAe = strAe.substring(0, strAe.length() - 5);
            i = 1;
        } else if (strAe.endsWith("-bold-italic")) {
            strAe = strAe.substring(0, strAe.length() - 12);
            i = 3;
        } else if (strAe.endsWith("-italic")) {
            strAe = strAe.substring(0, strAe.length() - 7);
            i = 2;
        }
        return Typeface.create(strAe, i);
    }

    public static /* synthetic */ void s(SpannableString spannableString, Object obj, int i, boolean z, int i2) {
        int iMin;
        int iMin2 = i < 0 ? 0 : Math.min(i, spannableString.length());
        if (!z) {
            iMin = spannableString.length();
        } else if (i2 <= 0) {
            return;
        } else {
            iMin = Math.min(i2 + iMin2, spannableString.length());
        }
        if (iMin2 != iMin) {
            spannableString.setSpan(obj, iMin2, iMin, 18);
        }
    }

    public static /* synthetic */ void t(Bitmap bitmap, Bitmap bitmap2) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        new Canvas(bitmap2).drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), paint);
    }

    public static /* synthetic */ Activity u(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static /* synthetic */ Rect v(Rect rect, View view, View view2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        return new Rect(rect.left + i, rect.top + i2, rect.right + i, rect.bottom + i2);
    }

    public static /* synthetic */ void w(View view, int i) {
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).aA(0, i, false);
        } else if (view instanceof ScrollView) {
            ((ScrollView) view).smoothScrollBy(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).w(0, i, false);
        }
    }

    public static /* synthetic */ boolean x(View view) {
        View childAt;
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.canScrollVertically(1) || recyclerView.canScrollVertically(-1)) {
                return true;
            }
        } else if (((view instanceof ScrollView) || (view instanceof NestedScrollView)) && (childAt = ((ViewGroup) view).getChildAt(0)) != null) {
            if (view.getHeight() < childAt.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void y(EditText editText, int i) {
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable textCursorDrawable = editText.getTextCursorDrawable();
            textCursorDrawable.setColorFilter(porterDuffColorFilter);
            editText.setTextCursorDrawable(textCursorDrawable);
            return;
        }
        try {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Drawable drawable = editText.getContext().getDrawable(i2);
            drawable.setColorFilter(porterDuffColorFilter);
            Drawable[] drawableArr = {drawable, drawable};
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableArr);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ String z(Context context) {
        File file = new File(context.getPackageResourcePath());
        if (file.exists() && file.canRead()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[16384];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                    for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                        messageDigest.update(bArr, 0, i);
                    }
                    String strJ = agyg.f.f().j(messageDigest.digest());
                    fileInputStream.close();
                    return strJ;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            }
        }
        return "";
    }
}
