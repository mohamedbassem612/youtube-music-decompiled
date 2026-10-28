package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nqv {
    public static Drawable a(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }

    public static ncl b(nci nciVar) {
        int iG = nciVar.g();
        for (int i = 0; i < iG; i++) {
            ncl nclVarI = nciVar.i(i);
            if (nclVarI.o()) {
                return nclVarI;
            }
        }
        return null;
    }

    public static agev c(nci nciVar) {
        ncl nclVarB = b(nciVar);
        return nclVarB == null ? agdf.a : d(nclVarB);
    }

    public static agev d(ncl nclVar) {
        if (!nclVar.o()) {
            return agdf.a;
        }
        ByteBuffer byteBufferL = nclVar.l();
        byte[] bArr = new byte[byteBufferL.remaining()];
        byteBufferL.get(bArr);
        return agev.i(bArr);
    }

    public static agev e(asnm asnmVar) {
        int size = asnmVar.c.size();
        for (int i = 0; i < size; i++) {
            asno asnoVar = (asno) asnmVar.c.get(i);
            int i2 = asnoVar.c;
            if (i2 == 2) {
                return agev.i((i2 == 2 ? (aigj) asnoVar.d : aigj.d).G());
            }
        }
        return agdf.a;
    }

    public static float f(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    public static void g(int i, int i2, int i3, int[] iArr) {
        int iMax = Math.max(0, i);
        int iMax2 = Math.max(0, i2);
        long j = ((long) iMax) + ((long) iMax2);
        if (j > i3 && i3 > 0) {
            iMax = Math.round(iMax * (i3 / j));
            iMax2 = Math.max(0, i3 - iMax);
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
    }

    public static String i(String str, Object... objArr) {
        return str + '(' + TextUtils.join(",", objArr) + ')';
    }

    public static String j(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder)));
        byte[] bArr = new byte[SemanticState.ReadOnly];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Alert.DURATION_SHOW_INDEFINITELY;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, SemanticState.ReadOnly));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }
}
