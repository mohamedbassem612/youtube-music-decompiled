package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import defpackage.avc;
import defpackage.yf;
import defpackage.zi;
import defpackage.zk;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@yf
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    CarMessage(zk zkVar) {
        avc avcVar = zkVar.a;
        this.mSender = null;
        CarText carText = zkVar.b;
        this.mBody = null;
        String str = zkVar.c;
        this.mMultimediaMimeType = null;
        Uri uri = zkVar.d;
        this.mMultimediaUri = null;
        long j = zkVar.e;
        this.mReceivedTimeEpochMillis = 0L;
        boolean z = zkVar.f;
        this.mIsRead = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarMessage) {
            CarMessage carMessage = (CarMessage) obj;
            if (zi.b(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead) {
                return true;
            }
        }
        return false;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public avc getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return avc.b(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(zi.a(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }
}
