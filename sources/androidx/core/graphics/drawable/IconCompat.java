package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import defpackage.a;
import defpackage.aaj;
import defpackage.aie;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static IconCompat e(Bundle bundle) {
        int i = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", a.bR(i, "Unknown type "));
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat f(Bitmap bitmap) {
        aie.f(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Resources resources, String str, int i) {
        aie.f(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f = i;
        if (resources != null) {
            try {
                iconCompat.c = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.c = str;
        }
        iconCompat.k = str;
        return iconCompat;
    }

    public final int a() {
        int i = this.b;
        if (i == -1) {
            return aaj.c(this.c);
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        return i == -1 ? aaj.d(this.c) : i;
    }

    public final Uri c() {
        int i = this.b;
        if (i == -1) {
            return aaj.f(this.c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.c);
        }
        toString();
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        switch (this.b) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.c);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.c);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.c);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.c);
                break;
        }
        bundle.putInt("type", this.b);
        bundle.putInt("int1", this.f);
        bundle.putInt("int2", this.g);
        bundle.putString("string1", this.k);
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != a) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final InputStream h(Context context) {
        Uri uriC = c();
        String scheme = uriC.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriC);
            } catch (Exception e) {
                Objects.toString(uriC);
                Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(uriC)), e);
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.c));
            } catch (FileNotFoundException e2) {
                Objects.toString(uriC);
                Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(uriC)), e2);
            }
        }
        return null;
    }

    public final String i() {
        int i = this.b;
        if (i == -1) {
            return aaj.h(this.c);
        }
        if (i == 2) {
            String str = this.k;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.c).split(":", -1)[0] : this.k;
        }
        toString();
        throw new IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append('x');
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(')');
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
