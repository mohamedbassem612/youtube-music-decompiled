package app.rive.core;

import defpackage.awrc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
interface DeferredResult {

    /* JADX INFO: compiled from: PG */
    public final class Failure implements DeferredResult {
        public static final int $stable = 8;
        private final Throwable error;

        public Failure(Throwable th) {
            th.getClass();
            this.error = th;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.error;
            }
            return failure.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Failure copy(Throwable th) {
            th.getClass();
            return new Failure(th);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Failure) && awrc.c(this.error, ((Failure) obj).error);
            }
            return true;
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Failure(error=" + this.error + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Success implements DeferredResult {
        public static final int $stable = 0;
        private final Object value;

        public Success(Object obj) {
            this.value = obj;
        }

        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final Object component1() {
            return this.value;
        }

        public final Success copy(Object obj) {
            return new Success(obj);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Success) && awrc.c(this.value, ((Success) obj).value);
            }
            return true;
        }

        public final Object getValue() {
            return this.value;
        }

        public int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public String toString() {
            return "Success(value=" + this.value + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Uninitialized implements DeferredResult {
        public static final int $stable = 0;
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninitialized)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1275792541;
        }

        public String toString() {
            return "Uninitialized";
        }
    }
}
