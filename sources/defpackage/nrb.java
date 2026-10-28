package defpackage;

import android.util.Size;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nrb {
    public static avlb a(nwg nwgVar, mew mewVar, nwf nwfVar) {
        try {
            CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mewVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
            aihl aihlVarCheckIsLite = aihn.checkIsLite(nwgVar.a());
            commandOuterClass$Command.c(aihlVarCheckIsLite);
            Object objK = commandOuterClass$Command.j.k(aihlVarCheckIsLite.d);
            return nwgVar.c(objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK), nwfVar);
        } catch (aiik e) {
            return avlb.m(e);
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "MISSING_REQUIRED_PARAMS";
        }
        if (i == 2) {
            return "ACCOUNT_ACQUISITION_ERROR";
        }
        if (i != 3) {
            return i != 4 ? "NETWORK_ERROR" : "WEB_PAGE_LOAD_ERROR";
        }
        return "OAUTH_TOKEN_ERROR";
    }

    public static Optional c(Future future) {
        try {
            return Optional.ofNullable(ahng.v(future));
        } catch (Exception unused) {
            return Optional.empty();
        }
    }

    public static boolean d(double d, double d2) {
        return ahbd.c(d, d2, 1.0E-4d);
    }

    public static Duration e(Duration duration) {
        return duration.truncatedTo(ChronoUnit.MICROS);
    }

    public static Duration f(Duration duration) {
        return duration.truncatedTo(ChronoUnit.MILLIS);
    }

    public static Size g(Size size, Size size2) {
        float width = size2.getWidth() / size.getWidth();
        float height = size2.getHeight() / size.getHeight();
        if (Math.min(width, height) >= 1.0f) {
            return size;
        }
        float fMin = Math.min(width, height);
        return new Size((int) (size.getWidth() * fMin), (int) (size.getHeight() * fMin));
    }

    public static Size h(Size size, Size size2, int i, boolean z) {
        Size size3;
        if (i != 2) {
            return g(size, size2);
        }
        float width = size2.getWidth() / size.getWidth();
        float height = size2.getHeight() / size.getHeight();
        float fMax = Math.max(width, height);
        if (fMax >= 1.0f) {
            return size;
        }
        Size sizeI = i(size2);
        Size sizeI2 = i(size);
        if (!z || sizeI.equals(sizeI2) || sizeI2.getHeight() != sizeI.getWidth() || sizeI2.getWidth() != sizeI.getHeight() || sizeI.getWidth() >= 20 || sizeI.getHeight() >= 20) {
            return new Size((int) (size.getWidth() * fMax), (int) (size.getHeight() * fMax));
        }
        if (width < height) {
            float width2 = size.getWidth() * fMax;
            int height2 = sizeI.getHeight();
            size3 = new Size((((((int) width2) + height2) - 1) / height2) * height2, size2.getHeight());
        } else {
            int width3 = size2.getWidth();
            float height3 = size.getHeight() * fMax;
            int width4 = sizeI.getWidth();
            size3 = new Size(width3, (((((int) height3) + width4) - 1) / width4) * width4);
        }
        return size3;
    }

    private static Size i(Size size) {
        int width = size.getWidth();
        int height = size.getHeight();
        ahng.V("a", width);
        ahng.V("b", height);
        if (width == 0) {
            width = height;
        } else if (height != 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(width);
            int iNumberOfTrailingZeros2 = width >> iNumberOfTrailingZeros;
            int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(height);
            int i = height >> iNumberOfTrailingZeros3;
            while (iNumberOfTrailingZeros2 != i) {
                int i2 = iNumberOfTrailingZeros2 - i;
                int i3 = (i2 >> 31) & i2;
                int i4 = (i2 - i3) - i3;
                iNumberOfTrailingZeros2 = i4 >> Integer.numberOfTrailingZeros(i4);
                i += i3;
            }
            width = iNumberOfTrailingZeros2 << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros3);
        }
        return new Size(size.getWidth() / width, size.getHeight() / width);
    }
}
