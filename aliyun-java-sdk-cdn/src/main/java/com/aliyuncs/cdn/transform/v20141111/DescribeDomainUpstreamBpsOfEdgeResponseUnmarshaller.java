/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainUpstreamBpsOfEdgeResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainUpstreamBpsOfEdgeResponse.DomainBpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainUpstreamBpsOfEdgeResponseUnmarshaller {

	public static DescribeDomainUpstreamBpsOfEdgeResponse unmarshall(DescribeDomainUpstreamBpsOfEdgeResponse describeDomainUpstreamBpsOfEdgeResponse, UnmarshallerContext context) {
		
		describeDomainUpstreamBpsOfEdgeResponse.setRequestId(context.stringValue("DescribeDomainUpstreamBpsOfEdgeResponse.RequestId"));

		List<DomainBpsModel> bpsDatasList = new ArrayList<DomainBpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainUpstreamBpsOfEdgeResponse.BpsDatas.Length"); i++) {
			DomainBpsModel domainBpsModel = new DomainBpsModel();
			domainBpsModel.setTime(context.stringValue("DescribeDomainUpstreamBpsOfEdgeResponse.BpsDatas["+ i +"].Time"));
			domainBpsModel.setBps(context.floatValue("DescribeDomainUpstreamBpsOfEdgeResponse.BpsDatas["+ i +"].Bps"));

			bpsDatasList.add(domainBpsModel);
		}
		describeDomainUpstreamBpsOfEdgeResponse.setBpsDatas(bpsDatasList);
	 
	 	return describeDomainUpstreamBpsOfEdgeResponse;
	}
}