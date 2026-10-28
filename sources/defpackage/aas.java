package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class aas {
    public static final void a(long j, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            alj.a.a(paint, j);
        } else {
            float[] fArr = alq.a;
            paint.setColor((int) (alf.e(j, alq.e) >>> 32));
        }
    }

    public static final void b(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static Spanned c(String str) {
        return Html.fromHtml(str, 63);
    }

    public static Object d(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
