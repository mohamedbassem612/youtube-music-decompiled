package com.google.android.libraries.blocks.runtime;

import com.google.android.libraries.blocks.StreamReaderWriter;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class InPlaceStream {
    public static final Object a = new Object();
    public InPlaceStreamReaderProxy b = null;
    public Runnable c = null;
    public Consumer d = null;
    public final List e = new ArrayList();
    public ReadState f = ReadState.a;
    public WriteState g = WriteState.a;
    private Throwable h = null;
    private boolean i = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PG */
    final class ReadState {
        public static final ReadState a;
        public static final ReadState b;
        public static final ReadState c;
        private static final /* synthetic */ ReadState[] d;

        static {
            ReadState readState = new ReadState("PENDING", 0);
            a = readState;
            ReadState readState2 = new ReadState("OPEN", 1);
            b = readState2;
            ReadState readState3 = new ReadState("CLOSED", 2);
            c = readState3;
            d = new ReadState[]{readState, readState2, readState3};
        }

        public static ReadState[] values() {
            return (ReadState[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: PG */
    final class WriteState {
        public static final WriteState a;
        public static final WriteState b;
        public static final WriteState c;
        private static final /* synthetic */ WriteState[] d;

        static {
            WriteState writeState = new WriteState("OPEN", 0);
            a = writeState;
            WriteState writeState2 = new WriteState("CLOSING", 1);
            b = writeState2;
            WriteState writeState3 = new WriteState("CLOSED", 2);
            c = writeState3;
            d = new WriteState[]{writeState, writeState2, writeState3};
        }

        public static WriteState[] values() {
            return (WriteState[]) d.clone();
        }
    }

    public static StreamReaderWriter a() {
        InPlaceStream inPlaceStream = new InPlaceStream();
        return new StreamReaderWriter(new InPlaceStreamReader(inPlaceStream), new InPlaceStreamWriter(inPlaceStream));
    }

    public final void b() {
        InPlaceStreamReaderProxy inPlaceStreamReaderProxy;
        Consumer consumer;
        if (this.f.equals(ReadState.a) || this.i) {
            return;
        }
        this.i = true;
        while (true) {
            try {
                List list = this.e;
                if (list.isEmpty() || !this.f.equals(ReadState.b)) {
                    break;
                }
                MessageLite messageLite = (MessageLite) list.remove(0);
                InPlaceStreamReaderProxy inPlaceStreamReaderProxy2 = this.b;
                if (inPlaceStreamReaderProxy2 != null && (consumer = inPlaceStreamReaderProxy2.a) != null) {
                    consumer.accept(messageLite);
                }
            } catch (Throwable th) {
                this.i = false;
                throw th;
            }
        }
        if (this.g == WriteState.b && (inPlaceStreamReaderProxy = this.b) != null) {
            this.g = WriteState.c;
            Throwable th2 = this.h;
            Consumer consumer2 = inPlaceStreamReaderProxy.b;
            if (consumer2 != null) {
                consumer2.accept(th2);
            }
        }
        this.i = false;
        if (this.f == ReadState.c || this.g == WriteState.c) {
            InPlaceStreamReaderProxy inPlaceStreamReaderProxy3 = this.b;
            if (inPlaceStreamReaderProxy3 != null) {
                inPlaceStreamReaderProxy3.a = null;
                inPlaceStreamReaderProxy3.b = null;
            }
            this.d = null;
            this.c = null;
            this.b = null;
        }
    }

    public final void c(Throwable th) {
        synchronized (a) {
            if (this.g != WriteState.a) {
                return;
            }
            this.g = WriteState.b;
            this.h = th;
            b();
        }
    }
}
