package com.google.cardboard.sdk.qrcode;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.google.android.apps.youtube.music.R;
import defpackage.a;
import defpackage.lqq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class QrCodeContentProcessor {
    private static final String TAG = "QrCodeContentProcessor";
    public static final /* synthetic */ int a = 0;
    private final Listener listener;

    /* JADX INFO: compiled from: PG */
    public interface Listener {
        void onQrCodeSaved(boolean z);
    }

    /* JADX INFO: compiled from: PG */
    public class ProcessAndSaveQrCodeTask extends AsyncTask {
        private final Context context;
        final /* synthetic */ QrCodeContentProcessor this$0;

        public ProcessAndSaveQrCodeTask(QrCodeContentProcessor qrCodeContentProcessor, Context context) {
            qrCodeContentProcessor.getClass();
            this.this$0 = qrCodeContentProcessor;
            this.context = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.cardboard.sdk.qrcode.AsyncTask
        public CardboardParamsUtils.UriToParamsStatus doInBackground(lqq lqqVar) {
            return QrCodeContentProcessor.getParamsFromQrCode(lqqVar, new UrlFactory());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.cardboard.sdk.qrcode.AsyncTask
        /* JADX INFO: renamed from: onPostExecute, reason: merged with bridge method [inline-methods] */
        public void lambda$execute$1(CardboardParamsUtils.UriToParamsStatus uriToParamsStatus) {
            int i = uriToParamsStatus.statusCode;
            boolean zWriteDeviceParams = false;
            if (i == 1) {
                int i2 = QrCodeContentProcessor.a;
                Toast.makeText(this.context, R.string.invalid_qr_code, 1).show();
            } else if (i == 2) {
                int i3 = QrCodeContentProcessor.a;
                Toast.makeText(this.context, R.string.connection_error, 1).show();
            } else {
                byte[] bArr = uriToParamsStatus.params;
                if (bArr != null) {
                    zWriteDeviceParams = CardboardParamsUtils.writeDeviceParams(bArr, this.context);
                    int i4 = QrCodeContentProcessor.a;
                }
            }
            this.this$0.listener.onQrCodeSaved(zWriteDeviceParams);
        }
    }

    public QrCodeContentProcessor(Listener listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CardboardParamsUtils.UriToParamsStatus getParamsFromQrCode(lqq lqqVar, UrlFactory urlFactory) {
        int i = lqqVar.d;
        if (i == 7 || i == 8) {
            return CardboardParamsUtils.getParamsFromUriString(lqqVar.b, urlFactory);
        }
        Log.e(TAG, a.bR(i, "Invalid QR code format: "));
        return CardboardParamsUtils.UriToParamsStatus.error(1);
    }

    public void processAndSaveQrCode(lqq lqqVar, Context context) {
        new ProcessAndSaveQrCodeTask(this, context).execute(lqqVar);
    }
}
