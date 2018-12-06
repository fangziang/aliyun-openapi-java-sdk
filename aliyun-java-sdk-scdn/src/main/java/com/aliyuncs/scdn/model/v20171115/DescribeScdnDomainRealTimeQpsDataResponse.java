/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainRealTimeQpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainRealTimeQpsDataResponse extends AcsResponse {

	private String requestId;

	private List<QpsModel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<QpsModel> getData() {
		return this.data;
	}

	public void setData(List<QpsModel> data) {
		this.data = data;
	}

	public static class QpsModel {

		private Float qps;

		private String timeStamp;

		public Float getQps() {
			return this.qps;
		}

		public void setQps(Float qps) {
			this.qps = qps;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeScdnDomainRealTimeQpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainRealTimeQpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}